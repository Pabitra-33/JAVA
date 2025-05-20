package com.inheritance;

class Humans {
	void human_form() {
		System.out.println("Humans are god's child");
	}
}

class Men extends Humans {
	void men_form() {
		System.out.println("Men's are brave.");
	}
}

class Boys extends Men {
	void boys_form() {
		System.out.println("Boy's are the future of Politics..");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Boys boy = new Boys();
		boy.human_form();
		boy.men_form();
		boy.boys_form();
	}
}