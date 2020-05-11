package com.syntax.class020_1;

import com.syntax.class020.Employee;

public class WaterfallTeam extends Employee {
public static void main(String[] args) {
	WaterfallTeam wteam=new WaterfallTeam();
	WaterfallTeam.company="Syntax";
	wteam.empNumber=124;//protected variable is visible to the child class in differrent package
//steam.salary// default is not visible
}

}
