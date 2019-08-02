package com.designPatterns.chainOfResponsibility;

public abstract class Handler {
	
	protected Handler next;
	
	public Handler(Handler next) {
        this.next = next;
    }  
	
	abstract void handle(char c);
	
	void doNext(char c) {
        if(next != null) {
           next.handle(c);
        }
    }
}
