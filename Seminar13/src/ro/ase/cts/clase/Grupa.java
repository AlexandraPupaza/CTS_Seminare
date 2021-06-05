package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Grupa {
	 private List<IStudent> studenti;
	    private int nrGrupa;

	    public Grupa(int nrGrupa){
	    	if(nrGrupa>=1000 && nrGrupa <=1100) {
	        this.nrGrupa=nrGrupa;
	        studenti=new ArrayList<>();
	        }
	    	else {
	    		throw new IllegalArgumentException();
	    	}
	       
	    }

	    public List<IStudent> getStudenti() {
			return studenti;
		}

		public int getNrGrupa() {
			return nrGrupa;
		}

		public void importaStudenti(List<IStudent> studenti){
	        this.studenti.addAll(studenti);
	    }

	    public void adaugaStudent(IStudent student){
	        studenti.add(student);
	    }

	    public IStudent getStudent(int index){
	        if(index>=0 && index< studenti.size()){
	            return studenti.get(index);
	        }
	        throw new IndexOutOfBoundsException();
	    }

	    public float getPromovabilitate(){
	    	if(studenti.size()==0) {
	    		throw new IndexOutOfBoundsException();
	    	}
	        int nrRestantieri=0;
	        for(IStudent student:studenti){
	            if(student.areRestante()){
	                nrRestantieri++;
	            }
	        }
	        return (float)(studenti.size()-nrRestantieri)/studenti.size();
	    }
}
