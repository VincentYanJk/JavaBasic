package com.pwc.generic;

public class GenericSample <T>{
private T entity;

public GenericSample(T entry){
	this.entity = entry;
}

public T getEntryValue() {
	
	return this.entity;
}


}
