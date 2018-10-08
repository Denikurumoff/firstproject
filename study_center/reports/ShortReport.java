/**package study_center.reports;

import study_center.Program;
import study_center.persons.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShortReport implements Report {
    SimpleDateFormat format = new SimpleDateFormat("dd.MMMM.yyyy HH:mm:ss");
    @Override
    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);
        Program program = currentStudent.getStudentsProgram();
        Date programStartDate = program.getProgramStartDate();
        StringBuilder shortInfo = new StringBuilder();
        shortInfo.append("STUDENT: " + currentStudent.getName() + " "+ currentStudent.getSurName()+ "\n");
        shortInfo.append("STUDENTS PROGRAM:" + program.getProgramName() + "\n");
        if(program.getProgramStartDate() !=null){
            shortInfo.append()
        }

    }
}
*/