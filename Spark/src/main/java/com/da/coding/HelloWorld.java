package com.da.coding;

import spark.Spark;

public class HelloWorld {
	public static void main(String[] args) {
		Spark.get("/hello", (req,res)->"Hello World");
	}
}
