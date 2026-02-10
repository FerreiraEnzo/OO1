package ar.edu.unlp.objetos.uno.Ejercicio12;

public class FifoJobScheduler extends JobScheduler{
	
	
	public JobDescription next() {
		
		JobDescription nextJob = null;
		
		nextJob = this.jobs.get(0);
        this.unschedule(nextJob);
        return nextJob;
	}
	
	
	
	
	
	
	
	

}
