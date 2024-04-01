package com.voya.food;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Waiter {
@Autowired	
IFoodMenu indian;
@Autowired
IFoodMenu chinese;
@Autowired
IFoodMenu italian;
@Autowired
@Qualifier("getIndian")
IFoodMenu iFoodMenu;

@Autowired
IFoodMenu menus;

IFoodMenu menuItems;
public void setMenu(IFoodMenu menuItems)
{
	this.menuItems=menuItems;
}

public IFoodMenu getiFoodMenu() {
	return iFoodMenu;
}
public void setiFoodMenu(IFoodMenu iFoodMenu) {
	this.iFoodMenu = iFoodMenu;
}
public IFoodMenu getIndian() {
	return indian;
}
public void setIndian(IFoodMenu indian) {
	this.indian = indian;
}
public IFoodMenu getChinese() {
	return chinese;
}
public void setChinese(IFoodMenu chinese) {
	this.chinese = chinese;
}
public IFoodMenu getItalian() {
	return italian;
}
public void setItalian(IFoodMenu italian) {
	this.italian = italian;
}

public List<String> viewMenuCard(String choice){
	List<String> menuList=new ArrayList<String>();
	if(choice.equals("indian"))
		 menuList=iFoodMenu.showItems();
	if(choice.equals("chinese"))
		menuList=iFoodMenu.showItems();
	if(choice.equals("italian"))
		menuList=iFoodMenu.showItems();
	
	return menuList;
	
}

}
