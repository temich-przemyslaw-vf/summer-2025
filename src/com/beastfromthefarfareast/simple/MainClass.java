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

public class MainClass {

	public static void main(String[] args) {
		
		Student student = new Student("Fred", "Flinstone");
		student.initGradesMap();
		SchoolSubject s = new SchoolSubject("Computer Science", "This subject is great!");
		student.addS(s);
		student.addGrade(s, 3);
		student.addGrade(s, 4);
		student.addGrade(s, 5);
		
		System.out.println("size of grades: " + student.gradesSize());
		System.out.println("following grades: " + student.getSubjectGradesByName("Computer Science"));
		System.out.println("gives avg: " + student.getGradesAvarage(s));


	}

}
