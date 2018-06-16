package jp.co.systena.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jp.co.systena.model.EntryForm;


@Controller
public class FormController {

  @Autowired
  HttpSession session;

  @RequestMapping (value="/Entry", method = RequestMethod.POST)
  public String send(EntryForm entry) {

	//セッションを保存
	session.setAttribute("entry", entry);

	//リダイレクト
	return "redirect:/Entry";
  }
}
