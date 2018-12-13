/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastfinal;

/**
 *
 * @author radik.fakhretdinov
 */

public class TableLand {
   
    public static void main(String[] args) {

		Table mainTable;

		mainTable=new Table(2);

		mainTable.setLegs(8);

		mainTable.length=80;

		mainTable.width=50;

		mainTable.collapsable=true;
                

		System.out.println(mainTable.setTableSize(5));

		System.out.println(mainTable.toCheck(true));
                
                System.out.println("Legs is " + mainTable.getLegs());



	} // close method main



} // close class TableLand
