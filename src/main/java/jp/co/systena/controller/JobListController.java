package jp.co.systena.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.model.Form;
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


  @RequestMapping (value="/EntryForm", method = RequestMethod.POST)
  public String indexForm(Form form) {

    //int id = form.getId();
    Job job = new JobListService().findJobById(form.getId());

	//セッションを保存
	session.setAttribute("form", form);

	//リダイレクト
	return "redirect:/EntryForm";
  }
}
