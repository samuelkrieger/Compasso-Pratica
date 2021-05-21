package com.compasso.service;

public interface Mapper<A,B> {
	B map(A input);
}
