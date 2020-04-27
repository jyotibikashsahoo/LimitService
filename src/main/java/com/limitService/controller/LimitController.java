/**
 * 
 */
package com.limitService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limitService.model.Limit;

/**
 * @author jyotibikashsahoo
 *
 */
@RestController
public class LimitController {
	private static Logger logger = LoggerFactory.getLogger(LimitController.class);

	@GetMapping("/limit")
	public String getLimit() {
		Limit limit = new Limit(99, 9);
		logger.info("The Maximum limit and minimum limit are respectivelly " + limit.getMaximumLimit() + " "
				+ limit.getMinimumLimit());
		return "The Maximum limit and minimum limit are respectivelly" +limit.getMaximumLimit() + " "
		+ limit.getMinimumLimit();
	}

}
