package ar.edu.unlp.objetos.uno.Ejercicio12;

public class LifoJobScheduler extends JobScheduler{
	
	
	
	public JobDescription next() {
		
		JobDescription nextJob = null;
		
		 nextJob = jobs.get(jobs.size()-1);
         this.unschedule(nextJob);
         return nextJob;
		
	}
	
	
	
	
	
	

}
