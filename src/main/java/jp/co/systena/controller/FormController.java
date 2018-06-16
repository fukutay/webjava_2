package jp.co.systena.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.systena.model.*;


@Controller
public class FormController {

  @Autowired
  HttpSession session;

  @RequestMapping (value="/EntryForm", method = RequestMethod.GET)
  public ModelAndView show(ModelAndView mav) {

	Form form = (Form) session.getAttribute("form");
	mav.addObject("formName", form.getName());
	mav.addObject("formStatus", form.getStatus());
	mav.addObject("formSalary", form.getSalary());
	//テンプレート指定
	mav.setViewName("EntryFormView01");
	//セッションクリア
	session.invalidate();

	return mav;
  }

  @RequestMapping (value="/Entry", method = RequestMethod.POST)
  public String entryForm(EntryForm entry) {

	//セッションを保存
	session.setAttribute("entry", entry);

	//リダイレクト
	return "redirect:/Entry";
  }
}
