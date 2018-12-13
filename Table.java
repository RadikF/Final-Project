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
public class Table {
// variables

    private int legs;
    public int width;
    public int length;
    public boolean collapsable;

    // methods
    public Table(int l) {
        legs = l;
    } // close method Table

    public int getLegs() {
        return legs;
    } // close getLegs

    public void setLegs(int l) {
        l = legs;
    } // close methood setLegs

    public int setTableSize(int numPeople) {
        width = width + (36 * numPeople);
        return width;
    } // close setTableSize 

    public int toCheck(boolean collaplsable) {

        if (collaplsable) {
            return legs / 2;
        } // close if
        else {
            return legs;
        } // close else

    } // close toCheck

} // close class Table
