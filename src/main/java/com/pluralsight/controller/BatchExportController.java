package com.pluralsight.controller;


import com.pluralsight.model.BatchExport;
import com.pluralsight.service.BatchExportService;
import com.pluralsight.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@SessionAttributes("batch")
public class BatchExportController {

    @Autowired
    private BatchExportService service;

    @RequestMapping(value = "addGoal", method = RequestMethod.GET)
    public String addBatchControl(Model model) {
        BatchExport export = new BatchExport();
        export.setBatchNumber("1234567");
        //export.setMinutes(10);
        model.addAttribute("batch", export);

        return "addGoal";
    }

    @RequestMapping(value = "addGoal", method = RequestMethod.POST)
    public String updateGoal(@Valid @ModelAttribute("batch") BatchExport export, BindingResult result) {

        System.out.println("result has errors: " + result.hasErrors());

        System.out.println("Entity Number: " + export.getEntityType()+export.getBatchNumber());

        if(result.hasErrors()) {
            return "addGoal";
        }else{
            service.save(export);
        }
        return "redirect:index.jsp";
       //return "redirect:addGoal";
    }

}
