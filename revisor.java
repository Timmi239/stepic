/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args)
	{
		String[] roles;
		StringBuilder[] lines;
		int iter = 0;
		boolean roles_ended = False;
		for (String str: args) {
			if (roles_ended == False) {
				if (str.startsWith("roles:") == True)
					continue;
				if (str.startsWith("textLines:") == True)
					roles_ended = True;
					continue;
				roles[i] = str;
			}
			else {
				for (int j = 0; j < roles.length; j++){
					if (str.startsWith(role[j]) == True){
						lines[j].append(Integer.toString(i+1) + ")" + str)
						break;
					}
				}
			}
			i++;
		}
		
	}
}