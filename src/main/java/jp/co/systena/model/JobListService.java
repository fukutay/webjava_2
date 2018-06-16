package jp.co.systena.model;

import java.util.ArrayList;
import java.util.List;


public class JobListService {

  private List<Job> JobList = new ArrayList<Job>();

  public JobListService(){

	    JobList.add(new Job(1, "株式会社a", "正社員", 500000));
	    JobList.add(new Job(2, "株式会社b", "契約社員", 450000));
	    JobList.add(new Job(3, "株式会社c", "正社員", 400000));
	    JobList.add(new Job(4, "株式会社d", "契約社員", 350000));
	    JobList.add(new Job(5, "株式会社e", "正社員", 300000));
	    JobList.add(new Job(6, "株式会社f", "契約社員", 250000));
	    JobList.add(new Job(7, "株式会社g", "正社員", 200000));
	    JobList.add(new Job(8, "株式会社h", "契約社員", 150000));
	    JobList.add(new Job(9, "株式会社i", "正社員", 100000));
	    JobList.add(new Job(10, "株式会社j", "契約社員", 50000));

  }

  public List<Job> getJobList() {
	    return JobList;
	  }

  public void setJobList(List<Job> JobList) {
	    this.JobList = JobList;
	  }

  public Job findJobById(int id) {
		for (Job job : JobList) {
			if (job.getId() == id) return job;
		}
		return null;
	}
}
