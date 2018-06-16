package jp.co.systena.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.model.EntryForm;


@Controller
public class EntryController {

  @Autowired
  HttpSession session;

  @RequestMapping (value="/Entry", method = RequestMethod.GET)
  public ModelAndView show(ModelAndView mav) {

	EntryForm entry = (EntryForm) session.getAttribute("entry");
	mav.addObject("entryName", entry.getName());
	//テンプレート指定
	mav.setViewName("EntryView");
	//セッションクリア
	session.invalidate();

	return mav;
  }
}
