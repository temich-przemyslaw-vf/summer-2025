/*
#    This program is free software: you can redistribute it and/or modify
#    it under the terms of the GNU General Public License as published by
#    the Free Software Foundation, either version 3 of the License, or
#    (at your option) any later version.
#
#    This program is distributed in the hope that it will be useful,
#    but WITHOUT ANY WARRANTY; without even the implied warranty of
#    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#    GNU General Public License for more details.
#
#    You should have received a copy of the GNU General Public License
#    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.beastfromthefarfareast.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
	
	public String name;
	
	public String surname;
	
	public HashMap<SchoolSubject, ArrayList<Integer>> grades;
	
	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public void initGradesMap() {
		grades = new HashMap<>();
	}
	
	/*
	 * this method adds a grade to subject 
	 * @param g from 1 to 6
	 * @param s school subject
	 */
	public void addGrade(SchoolSubject s, int g) {
		grades.get(s).add(g);
	}
	
	public void addS(SchoolSubject s) {
		grades.put(s, new ArrayList<Integer>());
	}
	
	public int gradesSize() {
		return grades.size();
	}
	
	float getGradesAvarage(SchoolSubject s) {
		int sum = 0;
		for (int grade : grades.get(s)) {
			sum = sum + grade;
		}
		return sum / grades.get(s).size();
	}
	
	public ArrayList<Integer> getSubjectGradesByName(String subjectName) {
		ArrayList<Integer> res = null;
		for (Map.Entry<SchoolSubject, ArrayList<Integer>> gradeSet : grades.entrySet()) {
			if (gradeSet.getKey().getName() == subjectName) {
				res = gradeSet.getValue();
			}
		}
		return res;
	}
	
  public String GetName() {
	  return name;
  }
  
  public String GetSurname() {
	  return surname;
  }
  
  public void setSurname(String surname) {
	  surname = surname;
  }
  
  public void setName(String name) {
	  name = name;
  }
	
}
