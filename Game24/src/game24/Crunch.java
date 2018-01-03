/*
FILE NAME:     Crunch.java
VERSION:       1.0
DESCRIPTION:   Game24 implementation using JavaFX
CLASS:         COMP 494, Spring 2016 Semester @ SMSU
INSTRUCTOR:    Professor Shushuang Man <mans@smsu.edu>
AUTHORS:       Nikolay Ivanov (Nick) <nikolay.ivanov@smsu.edu>
                     <nnrowan@gmail.com
               Anthony Angrimson <anthony.angrimson@smsu.edu>
                     <angrinord@gmail.com>
LICENSE:       GNU General Public License v.3
               [http://www.gnu.org/licenses/gpl-3.0.en.html]
DATE:          1/25/2016

DOCUMENTATION: Ask Dr. Man @ SMSU or Wikipedia
*/
package game24;

/**
 *
 * @author Nikolay Ivanov & Anthony Angrimson
 */
public class Crunch {
    public static String go(int w, int x, int y, int z)
    {
	String s = "Sorry...";
        int a;
        int b;
        int c;
        int d;
        
        int[] values = {w,x,y,z};
        
        for(int i =0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(j==i){
                    continue;
                }
                for(int k = 0;k<4;k++){
                    if(k==j || k==i){
                        continue;
                    }
                    for(int l=0;l<4;l++){
                        if(l == k || l == j || l == i){
                            continue;
                        }
                        
a=values[i];
b=values[j];
c=values[k];
d=values[l];
        
        
/*
**This block of if statements checks every permutation of the form A#B#C#D==24
**64 permutations in total
*/
    if ((a + b + c + d) == 24) return String.format("%1d + %2d + %3d + %4d = 24",a,b,c,d);
    if ((a + b + c - d) == 24) return String.format("%1d + %2d + %3d - %4d = 24",a,b,c,d);
    if ((a + b + c * d) == 24) return String.format("%1d + %2d + %3d * %4d = 24",a,b,c,d);
    if ((a + b + c / d) == 24) return String.format("%1d + %2d + %3d / %4d = 24",a,b,c,d);
    if ((a + b - c + d) == 24) return String.format("%1d + %2d - %3d + %4d = 24",a,b,c,d);
    if ((a + b - c - d) == 24) return String.format("%1d + %2d - %3d - %4d = 24",a,b,c,d);
    if ((a + b - c * d) == 24) return String.format("%1d + %2d - %3d * %4d = 24",a,b,c,d);
    if ((a + b - c / d) == 24) return String.format("%1d + %2d - %3d / %4d = 24",a,b,c,d);
    if ((a + b * c + d) == 24) return String.format("%1d + %2d * %3d + %4d = 24",a,b,c,d);
    if ((a + b * c - d) == 24) return String.format("%1d + %2d * %3d - %4d = 24",a,b,c,d);
    if ((a + b * c * d) == 24) return String.format("%1d + %2d * %3d * %4d = 24",a,b,c,d);
    if ((a + b * c / d) == 24) return String.format("%1d + %2d * %3d / %4d = 24",a,b,c,d);
    if ((a + b / c + d) == 24) return String.format("%1d + %2d / %3d + %4d = 24",a,b,c,d);
    if ((a + b / c - d) == 24) return String.format("%1d + %2d / %3d - %4d = 24",a,b,c,d);
    if ((a + b / c * d) == 24) return String.format("%1d + %2d / %3d * %4d = 24",a,b,c,d);
    if ((a + b / c / d) == 24) return String.format("%1d + %2d / %3d / %4d = 24",a,b,c,d);
    if ((a - b + c + d) == 24) return String.format("%1d - %2d + %3d + %4d = 24",a,b,c,d);
    if ((a - b + c - d) == 24) return String.format("%1d - %2d + %3d - %4d = 24",a,b,c,d);
    if ((a - b + c * d) == 24) return String.format("%1d - %2d + %3d * %4d = 24",a,b,c,d);
    if ((a - b + c / d) == 24) return String.format("%1d - %2d + %3d / %4d = 24",a,b,c,d);
    if ((a - b - c + d) == 24) return String.format("%1d - %2d - %3d + %4d = 24",a,b,c,d);
    if ((a - b - c - d) == 24) return String.format("%1d - %2d - %3d - %4d = 24",a,b,c,d);
    if ((a - b - c * d) == 24) return String.format("%1d - %2d - %3d * %4d = 24",a,b,c,d);
    if ((a - b - c / d) == 24) return String.format("%1d - %2d - %3d / %4d = 24",a,b,c,d);
    if ((a - b * c + d) == 24) return String.format("%1d - %2d * %3d + %4d = 24",a,b,c,d);
    if ((a - b * c - d) == 24) return String.format("%1d - %2d * %3d - %4d = 24",a,b,c,d);
    if ((a - b * c * d) == 24) return String.format("%1d - %2d * %3d * %4d = 24",a,b,c,d);
    if ((a - b * c / d) == 24) return String.format("%1d - %2d * %3d / %4d = 24",a,b,c,d);
    if ((a - b / c + d) == 24) return String.format("%1d - %2d / %3d + %4d = 24",a,b,c,d);
    if ((a - b / c - d) == 24) return String.format("%1d - %2d / %3d - %4d = 24",a,b,c,d);
    if ((a - b / c * d) == 24) return String.format("%1d - %2d / %3d * %4d = 24",a,b,c,d);
    if ((a - b / c / d) == 24) return String.format("%1d - %2d / %3d / %4d = 24",a,b,c,d);
    if ((a * b + c + d) == 24) return String.format("%1d * %2d + %3d + %4d = 24",a,b,c,d);
    if ((a * b + c - d) == 24) return String.format("%1d * %2d + %3d - %4d = 24",a,b,c,d);
    if ((a * b + c * d) == 24) return String.format("%1d * %2d + %3d * %4d = 24",a,b,c,d);
    if ((a * b + c / d) == 24) return String.format("%1d * %2d + %3d / %4d = 24",a,b,c,d);
    if ((a * b - c + d) == 24) return String.format("%1d * %2d - %3d + %4d = 24",a,b,c,d);
    if ((a * b - c - d) == 24) return String.format("%1d * %2d - %3d - %4d = 24",a,b,c,d);
    if ((a * b - c * d) == 24) return String.format("%1d * %2d - %3d * %4d = 24",a,b,c,d);
    if ((a * b - c / d) == 24) return String.format("%1d * %2d - %3d / %4d = 24",a,b,c,d);
    if ((a * b * c + d) == 24) return String.format("%1d * %2d * %3d + %4d = 24",a,b,c,d);
    if ((a * b * c - d) == 24) return String.format("%1d * %2d * %3d - %4d = 24",a,b,c,d);
    if ((a * b * c * d) == 24) return String.format("%1d * %2d * %3d * %4d = 24",a,b,c,d);
    if ((a * b * c / d) == 24) return String.format("%1d * %2d * %3d / %4d = 24",a,b,c,d);
    if ((a * b / c + d) == 24) return String.format("%1d * %2d / %3d + %4d = 24",a,b,c,d);
    if ((a * b / c - d) == 24) return String.format("%1d * %2d / %3d - %4d = 24",a,b,c,d);
    if ((a * b / c * d) == 24) return String.format("%1d * %2d / %3d * %4d = 24",a,b,c,d);
    if ((a * b / c / d) == 24) return String.format("%1d * %2d / %3d / %4d = 24",a,b,c,d);
    if ((a / b + c + d) == 24) return String.format("%1d / %2d + %3d + %4d = 24",a,b,c,d);
    if ((a / b + c - d) == 24) return String.format("%1d / %2d + %3d - %4d = 24",a,b,c,d);
    if ((a / b + c * d) == 24) return String.format("%1d / %2d + %3d * %4d = 24",a,b,c,d);
    if ((a / b + c / d) == 24) return String.format("%1d / %2d + %3d / %4d = 24",a,b,c,d);
    if ((a / b - c + d) == 24) return String.format("%1d / %2d - %3d + %4d = 24",a,b,c,d);
    if ((a / b - c - d) == 24) return String.format("%1d / %2d - %3d - %4d = 24",a,b,c,d);
    if ((a / b - c * d) == 24) return String.format("%1d / %2d - %3d * %4d = 24",a,b,c,d);
    if ((a / b - c / d) == 24) return String.format("%1d / %2d - %3d / %4d = 24",a,b,c,d);
    if ((a / b * c + d) == 24) return String.format("%1d / %2d * %3d + %4d = 24",a,b,c,d);
    if ((a / b * c - d) == 24) return String.format("%1d / %2d * %3d - %4d = 24",a,b,c,d);
    if ((a / b * c * d) == 24) return String.format("%1d / %2d * %3d * %4d = 24",a,b,c,d);
    if ((a / b * c / d) == 24) return String.format("%1d / %2d * %3d / %4d = 24",a,b,c,d);
    if ((a / b / c + d) == 24) return String.format("%1d / %2d / %3d + %4d = 24",a,b,c,d);
    if ((a / b / c - d) == 24) return String.format("%1d / %2d / %3d - %4d = 24",a,b,c,d);
    if ((a / b / c * d) == 24) return String.format("%1d / %2d / %3d * %4d = 24",a,b,c,d);
    if ((a / b / c / d) == 24) return String.format("%1d / %2d / %3d / %4d = 24",a,b,c,d);
    
/*
**This block of if statements checks every permutation of the form (A#B)#C#D==24
**and which do not simplify to a previous form
**16 permutations in total
*/
    if (((a + b) * c + d) == 24) return String.format("(%1d + %2d) * %3d + %4d = 24",a,b,c,d);
    if (((a + b) * c - d) == 24) return String.format("(%1d + %2d) * %3d - %4d = 24",a,b,c,d);
    if (((a + b) * c * d) == 24) return String.format("(%1d + %2d) * %3d * %4d = 24",a,b,c,d);
    if (((a + b) * c / d) == 24) return String.format("(%1d + %2d) * %3d / %4d = 24",a,b,c,d);
    if (((a + b) / c + d) == 24) return String.format("(%1d + %2d) / %3d + %4d = 24",a,b,c,d);
    if (((a + b) / c - d) == 24) return String.format("(%1d + %2d) / %3d - %4d = 24",a,b,c,d);
    if (((a + b) / c * d) == 24) return String.format("(%1d + %2d) / %3d * %4d = 24",a,b,c,d);
    if (((a + b) / c / d) == 24) return String.format("(%1d + %2d) / %3d / %4d = 24",a,b,c,d);
    if (((a - b) * c + d) == 24) return String.format("(%1d - %2d) * %3d + %4d = 24",a,b,c,d);
    if (((a - b) * c - d) == 24) return String.format("(%1d - %2d) * %3d - %4d = 24",a,b,c,d);
    if (((a - b) * c * d) == 24) return String.format("(%1d - %2d) * %3d * %4d = 24",a,b,c,d);
    if (((a - b) * c / d) == 24) return String.format("(%1d - %2d) * %3d / %4d = 24",a,b,c,d);
    if (((a - b) / c + d) == 24) return String.format("(%1d - %2d) / %3d + %4d = 24",a,b,c,d);
    if (((a - b) / c - d) == 24) return String.format("(%1d - %2d) / %3d - %4d = 24",a,b,c,d);
    if (((a - b) / c * d) == 24) return String.format("(%1d - %2d) / %3d * %4d = 24",a,b,c,d);
    if (((a - b) / c / d) == 24) return String.format("(%1d - %2d) / %3d / %4d = 24",a,b,c,d);
	
/*
**This block of if statements checks every permutation of the form A#%2d#(%3d#D)==24
**and which do not simplify to a previous form
**16 permutations in total
*/
    if(c!=d){
        if ((a + b / (c - d)) == 24) return String.format("%1d + %2d / (%3d - %4d) = 24",a,b,c,d);
        if ((a - b / (c - d)) == 24) return String.format("%1d - %2d / (%3d - %4d) = 24",a,b,c,d);
        if ((a * b / (c - d)) == 24) return String.format("%1d * %2d / (%3d - %4d) = 24",a,b,c,d);
        if ((a / b / (c - d)) == 24) return String.format("%1d / %2d / (%3d - %4d) = 24",a,b,c,d);
    }
    if ((a + b * (c + d)) == 24) return String.format("%1d + %2d * (%3d + %4d) = 24",a,b,c,d);
    if ((a + b * (c - d)) == 24) return String.format("%1d + %2d * (%3d - %4d) = 24",a,b,c,d);
    if ((a + b / (c + d)) == 24) return String.format("%1d + %2d / (%3d + %4d) = 24",a,b,c,d);
    if ((a - b * (c + d)) == 24) return String.format("%1d - %2d * (%3d + %4d) = 24",a,b,c,d);
    if ((a - b * (c - d)) == 24) return String.format("%1d - %2d * (%3d - %4d) = 24",a,b,c,d);
    if ((a - b / (c + d)) == 24) return String.format("%1d - %2d / (%3d + %4d) = 24",a,b,c,d);
    if ((a * b * (c + d)) == 24) return String.format("%1d * %2d * (%3d + %4d) = 24",a,b,c,d);
    if ((a * b * (c - d)) == 24) return String.format("%1d * %2d * (%3d - %4d) = 24",a,b,c,d);
    if ((a * b / (c + d)) == 24) return String.format("%1d * %2d / (%3d + %4d) = 24",a,b,c,d);
    if ((a / b * (c + d)) == 24) return String.format("%1d / %2d * (%3d + %4d) = 24",a,b,c,d);
    if ((a / b * (c - d)) == 24) return String.format("%1d / %2d * (%3d - %4d) = 24",a,b,c,d);
    if ((a / b / (c + d)) == 24) return String.format("%1d / %2d / (%3d + %4d) = 24",a,b,c,d);
    
/*This block of if statements checks every permutation of the form (A#%2d#%3d)#D==24
**and which do not simplify to a previous form
**24 permutations in total
*/

    if (((a + b + c) * d) == 24) return String.format("(%1d + %2d + %3d) * %4d = 24",a,b,c,d);
    if (((a + b + c) / d) == 24) return String.format("(%1d + %2d + %3d) / %4d = 24",a,b,c,d);
    if (((a + b - c) * d) == 24) return String.format("(%1d + %2d - %3d) * %4d = 24",a,b,c,d);
    if (((a + b - c) / d) == 24) return String.format("(%1d + %2d - %3d) / %4d = 24",a,b,c,d);
    if (((a - b + c) * d) == 24) return String.format("(%1d - %2d + %3d) * %4d = 24",a,b,c,d);
    if (((a - b + c) / d) == 24) return String.format("(%1d - %2d + %3d) / %4d = 24",a,b,c,d);
    if (((a - b - c) * d) == 24) return String.format("(%1d - %2d - %3d) * %4d = 24",a,b,c,d);
    if (((a - b - c) / d) == 24) return String.format("(%1d - %2d - %3d) / %4d = 24",a,b,c,d);
    if (((a * b + c) * d) == 24) return String.format("(%1d * %2d + %3d) * %4d = 24",a,b,c,d);
    if (((a * b + c) / d) == 24) return String.format("(%1d * %2d + %3d) / %4d = 24",a,b,c,d);
    if (((a * b - c) * d) == 24) return String.format("(%1d * %2d - %3d) * %4d = 24",a,b,c,d);
    if (((a * b - c) / d) == 24) return String.format("(%1d * %2d - %3d) / %4d = 24",a,b,c,d);
    if (((a / b + c) * d) == 24) return String.format("(%1d / %2d + %3d) * %4d = 24",a,b,c,d);
    if (((a / b + c) / d) == 24) return String.format("(%1d / %2d + %3d) / %4d = 24",a,b,c,d);
    if (((a / b - c) * d) == 24) return String.format("(%1d / %2d - %3d) * %4d = 24",a,b,c,d);
    if (((a / b - c) / d) == 24) return String.format("(%1d / %2d - %3d) / %4d = 24",a,b,c,d);
    if (((a + b * c) * d) == 24) return String.format("(%1d + %2d * %3d) * %4d = 24",a,b,c,d);
    if (((a + b * c) / d) == 24) return String.format("(%1d + %2d * %3d) / %4d = 24",a,b,c,d);
    if (((a + b / c) * d) == 24) return String.format("(%1d + %2d / %3d) * %4d = 24",a,b,c,d);
    if (((a + b / c) / d) == 24) return String.format("(%1d + %2d / %3d) / %4d = 24",a,b,c,d);
    if (((a - b * c) * d) == 24) return String.format("(%1d - %2d * %3d) * %4d = 24",a,b,c,d);
    if (((a - b * c) / d) == 24) return String.format("(%1d - %2d * %3d) / %4d = 24",a,b,c,d);
    if (((a - b / c) * d) == 24) return String.format("(%1d - %2d / %3d) * %4d = 24",a,b,c,d);
    if (((a - b / c) / d) == 24) return String.format("(%1d - %2d / %3d) / %4d = 24",a,b,c,d);
    
/*This block of if statements checks every permutation of the form A#(%2d#%3d)#D==24
**and which do not simplify to a previous form
**24 permutations in total
*/

    if(b!=c){
        if ((a / (b - c) * d) == 24) return String.format("%1d / (%2d - %3d) * %4d = 24",a,b,c,d);
        if ((a / (b - c) / d) == 24) return String.format("%1d / (%2d - %3d) / %4d = 24",a,b,c,d);
        if ((a / (b - c) + d) == 24) return String.format("%1d / (%2d - %3d) + %4d = 24",a,b,c,d);
        if ((a / (b - c) - d) == 24) return String.format("%1d / (%2d - %3d) - %4d = 24",a,b,c,d);
    }
    if ((a * (b + c) * d) == 24) return String.format("%1d * (%2d + %3d) * %4d = 24",a,b,c,d);
    if ((a * (b + c) / d) == 24) return String.format("%1d * (%2d + %3d) / %4d = 24",a,b,c,d);
    if ((a * (b - c) * d) == 24) return String.format("%1d * (%2d - %3d) * %4d = 24",a,b,c,d);
    if ((a * (b - c) / d) == 24) return String.format("%1d * (%2d - %3d) / %4d = 24",a,b,c,d);
    if ((a / (b + c) * d) == 24) return String.format("%1d / (%2d + %3d) * %4d = 24",a,b,c,d);
    if ((a / (b + c) / d) == 24) return String.format("%1d / (%2d + %3d) / %4d = 24",a,b,c,d);
    if ((a + (b + c) * d) == 24) return String.format("%1d + (%2d + %3d) * %4d = 24",a,b,c,d);
    if ((a + (b + c) / d) == 24) return String.format("%1d + (%2d + %3d) / %4d = 24",a,b,c,d);
    if ((a + (b - c) * d) == 24) return String.format("%1d + (%2d - %3d) * %4d = 24",a,b,c,d);
    if ((a + (b - c) / d) == 24) return String.format("%1d + (%2d - %3d) / %4d = 24",a,b,c,d);
    if ((a - (b + c) * d) == 24) return String.format("%1d - (%2d + %3d) * %4d = 24",a,b,c,d);
    if ((a - (b + c) / d) == 24) return String.format("%1d - (%2d + %3d) / %4d = 24",a,b,c,d);
    if ((a - (b - c) * d) == 24) return String.format("%1d - (%2d - %3d) * %4d = 24",a,b,c,d);
    if ((a - (b - c) / d) == 24) return String.format("%1d - (%2d - %3d) / %4d = 24",a,b,c,d);
    if ((a * (b + c) + d) == 24) return String.format("%1d * (%2d + %3d) + %4d = 24",a,b,c,d);
    if ((a * (b + c) - d) == 24) return String.format("%1d * (%2d + %3d) - %4d = 24",a,b,c,d);
    if ((a * (b - c) + d) == 24) return String.format("%1d * (%2d - %3d) + %4d = 24",a,b,c,d);
    if ((a * (b - c) - d) == 24) return String.format("%1d * (%2d - %3d) - %4d = 24",a,b,c,d);
    if ((a / (b + c) + d) == 24) return String.format("%1d / (%2d + %3d) + %4d = 24",a,b,c,d);
    if ((a / (b + c) - d) == 24) return String.format("%1d / (%2d + %3d) - %4d = 24",a,b,c,d);
    
/*This block of if statements checks every permutation of the form A#(%2d#%3d#D)==24
**and which do not simplify to a previous form
**24 permutations in total
*/

    if(b+c!=d){
        if ((a / (b + c - d)) == 24) return String.format("%1d / (%2d + %3d - %4d) = 24",a,b,c,d);
    }
    if(b+d!=c){
        if ((a / (b - c + d)) == 24) return String.format("%1d / (%2d - %3d + %4d) = 24",a,b,c,d);
    }
    if(b!=c/d){
       if ((a / (b - c / d)) == 24) return String.format("%1d / (%2d - %3d / %4d) = 24",a,b,c,d);
    }
    if(b!=c*d){
        if ((a / (b - c * d)) == 24) return String.format("%1d / (%2d - %3d * %4d) = 24",a,b,c,d);
    }
    if(b*c!=d){
        if ((a / (b * c - d)) == 24) return String.format("%1d / (%2d * %3d - %4d) = 24",a,b,c,d);
    }
    if(b-c!=d){
        if ((a / (b - c - d)) == 24) return String.format("%1d / (%2d - %3d - %4d) = 24",a,b,c,d);
        
    }
    if(b/c!=d){
        if ((a / (b / c - d)) == 24) return String.format("%1d / (%2d / %3d - %4d) = 24",a,b,c,d);
    }
    if ((a * (b + c + d)) == 24) return String.format("%1d * (%2d + %3d + %4d) = 24",a,b,c,d);
    if ((a * (b + c - d)) == 24) return String.format("%1d * (%2d + %3d - %4d) = 24",a,b,c,d);
    if ((a * (b - c + d)) == 24) return String.format("%1d * (%2d - %3d + %4d) = 24",a,b,c,d);
    if ((a * (b - c - d)) == 24) return String.format("%1d * (%2d - %3d - %4d) = 24",a,b,c,d);
    if ((a / (b + c + d)) == 24) return String.format("%1d / (%2d + %3d + %4d) = 24",a,b,c,d);
    if ((a * (b * c + d)) == 24) return String.format("%1d * (%2d * %3d + %4d) = 24",a,b,c,d);
    if ((a * (b * c - d)) == 24) return String.format("%1d * (%2d * %3d - %4d) = 24",a,b,c,d);
    if ((a * (b / c + d)) == 24) return String.format("%1d * (%2d / %3d + %4d) = 24",a,b,c,d);
    if ((a * (b / c - d)) == 24) return String.format("%1d * (%2d / %3d - %4d) = 24",a,b,c,d);
    if ((a / (b * c + d)) == 24) return String.format("%1d / (%2d * %3d + %4d) = 24",a,b,c,d);
    if ((a / (b / c + d)) == 24) return String.format("%1d / (%2d / %3d + %4d) = 24",a,b,c,d);
    if ((a * (b + c * d)) == 24) return String.format("%1d * (%2d + %3d * %4d) = 24",a,b,c,d);
    if ((a * (b + c / d)) == 24) return String.format("%1d * (%2d + %3d / %4d) = 24",a,b,c,d);
    if ((a * (b - c * d)) == 24) return String.format("%1d * (%2d - %3d * %4d) = 24",a,b,c,d);
    if ((a * (b - c / d)) == 24) return String.format("%1d * (%2d - %3d / %4d) = 24",a,b,c,d);
    if ((a / (b + c * d)) == 24) return String.format("%1d / (%2d + %3d * %4d) = 24",a,b,c,d);
    if ((a / (b + c / d)) == 24) return String.format("%1d / (%2d + %3d / %4d) = 24",a,b,c,d);
    
    
/*This block of if statements checks every permutation of the form (A#%2d)#(%3d#D)==24
**and which do not simplify to a previous form
**8 permutations in total
*/

    if(c!=d){
        if (((a + b) / (c - d)) == 24) return String.format("(%1d + %2d) / (%3d - %4d) = 24",a,b,c,d);
        if (((a - b) / (c - d)) == 24) return String.format("(%1d - %2d) / (%3d - %4d) = 24",a,b,c,d);
    }
    if (((a + b) * (c + d)) == 24) return String.format("(%1d + %2d) * (%3d + %4d) = 24",a,b,c,d);
    if (((a + b) * (c - d)) == 24) return String.format("(%1d + %2d) * (%3d - %4d) = 24",a,b,c,d);
    if (((a + b) / (c + d)) == 24) return String.format("(%1d + %2d) / (%3d + %4d) = 24",a,b,c,d);
    if (((a - b) * (c + d)) == 24) return String.format("(%1d - %2d) * (%3d + %4d) = 24",a,b,c,d);
    if (((a - b) * (c - d)) == 24) return String.format("(%1d - %2d) * (%3d - %4d) = 24",a,b,c,d);
    if (((a - b) / (c + d)) == 24) return String.format("(%1d - %2d) / (%3d + %4d) = 24",a,b,c,d);
    
                    }
                }
            }
        }
/*A grand total of 176 permutations were checked*/
	
	return s;
    }

}
