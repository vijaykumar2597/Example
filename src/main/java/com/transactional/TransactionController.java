package com.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TransactionController {
	
	@Autowired
	SenderRepo s;
	
	@Autowired
	ReciverRepo r;
	
	@Transactional
	@PostMapping(value="/post")
	public String post(@RequestBody Transaction t) {
		s.save(t.getSender());
		int a=10/0;
		r.save(t.getReciver());
		return "Posted";
	}

}
