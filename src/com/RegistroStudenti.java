package com;

import com.oop.snacks.Studente;

public class RegistroStudenti {

    private Studente[] register;

    public RegistroStudenti(){
        this.register = new Studente[0];
    }
    public Studente[] getRegister(){
        return this.register;
    }

    public void addStudents(Studente student){
        // Creo un nuovo array basato sull'ultimo
        Studente[] newReg= new Studente[register.length+1];

        for(int i=0; i<register.length;i++){
            newReg[i]=register[i];
        }

        newReg[newReg.length-1]=student;
        this.register=newReg;
    }

    public String getAllStudents(){
        String results= "Registro degli studenti: ";
        for (Studente stu : register) {
            results+=String.format("%n%s%n", stu.getStudentInfo());
            
        }
        return results;
    }



}
