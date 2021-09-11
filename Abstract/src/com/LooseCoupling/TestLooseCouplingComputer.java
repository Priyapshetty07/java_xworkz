package com.LooseCoupling;

public class TestLooseCouplingComputer {

	public static void main(String[] args) {
		Sony sony = new Sony();
		Epson epson = new Epson();
		
		Computer computer= new Computer();
		
		computer.slot(epson);
		
		computer.slot(sony);

	}

}
