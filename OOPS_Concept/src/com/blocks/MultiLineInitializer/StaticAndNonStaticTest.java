package com.blocks.MultiLineInitializer;

public class StaticAndNonStaticTest {
	//static block-1
		static {
			System.out.println("Static block-1");
			StaticAndNonStaticTest sn = new StaticAndNonStaticTest();
			System.out.println(sn);
		}
		
		//non-static block-1
		{
			System.out.println("Non-static block-1");
		}
		
		//main method
		public static void main(String[] args) {
			System.out.println("Main Starts");
			{
				StaticAndNonStaticTest sn = new StaticAndNonStaticTest();
				System.out.println(sn);
			}
			System.out.println("Main Ends");
		}
		
		//non-static block-2
		{
			System.out.println("Non-Static block-2");
		}
		
		//static block-2
		static {
			StaticAndNonStaticTest sn = new StaticAndNonStaticTest();
			System.out.println(sn);
			System.out.println("Static block-2");
		}
}
