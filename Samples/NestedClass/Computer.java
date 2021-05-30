package com.onebill.corejava.basics.NestedClass;

class CPU {
	class Ram {
		int ram;
		String Manufacturer;
		Ram(int inp1, String inp2) {
			ram = inp1;
			Manufacturer = inp2;
		}
		void print() {
			System.out.println("RAM Memory is"+ ram+" and Manufacturer is"+ Manufacturer);
		}
	}
	class Processor {
		String Brand;
		String Version;
		Processor(String inp1, String inp2) {
			Brand = inp1;
			Version = inp2;
		}
		void print() {
			System.out.println("Processor's Brand is" + Brand+ " and version is i5 8th gen"+ Version);
		}
	}
	void print() {
		System.out.println("The CPU features are:");
	}
}

public class Computer {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.Ram ram = new CPU().new Ram(8 , "Acer");
		CPU.Processor processor = new CPU().new Processor("Intel"," i5");
		cpu.print();
		ram.print();
		processor.print();

	}

}
