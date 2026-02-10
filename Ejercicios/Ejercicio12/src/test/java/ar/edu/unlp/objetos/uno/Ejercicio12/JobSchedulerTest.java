package ar.edu.unlp.objetos.uno.Ejercicio12;
 
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;

    private void initializeJobs() {

        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
    }

    @BeforeEach
    void setUp() {
        this.initializeJobs();
    }

    private JobScheduler newFifoScheduler() {
        JobScheduler fifoJobScheduler = new FifoJobScheduler();
        return fifoJobScheduler;
    }

    private JobScheduler newLifoScheduler() {
        JobScheduler lifoScheduler = new LifoJobScheduler();
        return lifoScheduler;
    }

    private JobScheduler newPriorityScheduler() {
        JobScheduler priorityScheduler = new HighestPriorityJB();
        return priorityScheduler;
    }

    private JobScheduler newEffortScheduler() {
        JobScheduler effortScheduler = new MostEffortJB();
        return effortScheduler;
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test
    void testSchedule() {
    	
        JobScheduler SchedulerOne = new LifoJobScheduler();
        SchedulerOne.schedule(lastJob);
        assertTrue(SchedulerOne.getJobs().contains(lastJob));
        
        JobScheduler SchedulerTwo = new FifoJobScheduler();
        SchedulerTwo.schedule(firstJob);
        assertTrue(SchedulerTwo.getJobs().contains(firstJob));
        
        JobScheduler SchedulerThree = new MostEffortJB();
        SchedulerThree.schedule(mostEffortJob);
        assertTrue(SchedulerThree.getJobs().contains(mostEffortJob));
        
        JobScheduler SchedulerFour = new HighestPriorityJB();
        SchedulerFour.schedule(highestPriorityJob);
        assertTrue(SchedulerFour.getJobs().contains(highestPriorityJob));
        
    }

    @Test
    void testUnschedule() {
        JobScheduler SchedulerOne= new LifoJobScheduler();
        this.scheduleJobsIn(SchedulerOne);  //CREO QUE NO ENTIENDO ESTA LÍNEA
        SchedulerOne.unschedule(highestPriorityJob);
        assertFalse(SchedulerOne.getJobs().contains(highestPriorityJob));
        
        
        JobScheduler SchedulerTwo= new FifoJobScheduler();
        this.scheduleJobsIn(SchedulerTwo);  
        SchedulerTwo.unschedule(highestPriorityJob);
        assertFalse(SchedulerTwo.getJobs().contains(highestPriorityJob));
        
        JobScheduler SchedulerThree= new HighestPriorityJB();
        this.scheduleJobsIn(SchedulerThree);  
        SchedulerThree.unschedule(highestPriorityJob);
        assertFalse(SchedulerThree.getJobs().contains(highestPriorityJob));
        
        JobScheduler SchedulerFour = new MostEffortJB();
        this.scheduleJobsIn(SchedulerFour);  
        SchedulerFour.unschedule(highestPriorityJob);
        assertFalse(SchedulerFour.getJobs().contains(highestPriorityJob));
        
        
    }

    @Test
    void testNext() {
        JobScheduler scheduler;

        scheduler = this.newFifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), firstJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newLifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), lastJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newPriorityScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), highestPriorityJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newEffortScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), mostEffortJob);
        assertEquals(scheduler.getJobs().size(), 3);
    }
}
