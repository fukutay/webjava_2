package jp.co.systena.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.model.Job;
import jp.co.systena.model.JobListService;


@Controller
public class JobListController {

  @Autowired
  HttpSession session;

  @RequestMapping (value="/HelloWork", method = RequestMethod.GET)
  public ModelAndView index(ModelAndView mav) {

    mav.addObject("jobList", new JobListService().getJobList());
    //テンプレート指定
    mav.setViewName("JobListView");

    return mav;
  }

  @RequestMapping (value="/EntryForm", method = RequestMethod.GET)
  public ModelAndView show(ModelAndView mav,
                            Job job,
                            @RequestParam(name = "id", required = true) int id
                            ) {

  job = new JobListService().findJobById(id);

  mav.addObject("formName", job.getName());
  mav.addObject("formStatus", job.getStatus());
  mav.addObject("formSalary", job.getSalary());

  //テンプレート指定
  if (job.getStatus() == "正社員" ) {
    mav.setViewName("EntryFormView01");
  }
  if (job.getStatus() == "契約社員" ) {
    mav.setViewName("EntryFormView02");
  }

  return mav;
  }
}
