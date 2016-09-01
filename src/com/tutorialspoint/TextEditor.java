package com.tutorialspoint;

public class TextEditor {
	
	private String name;
	private CheckSpeller checkSpeller;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CheckSpeller getCheckSpeller() {
		return checkSpeller;
	}

	public void setCheckSpeller(CheckSpeller checkSpeller) {
		this.checkSpeller = checkSpeller;
	}	
	
	public void checkSpell () {
		checkSpeller.spellChecking();
	}
}
