package com.example.demo.models;

public class ValidationInput {

	private String name;
    private byte[] input;

    public ValidationInput() {

    }
    
    public ValidationInput(String name, byte[] input) {
    	this.name = name;
    	this.input = input;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public byte[] getInput() {
        return this.input;
    }

    public void setInput(byte[] input) {
        this.input = input;
    }
	
}
