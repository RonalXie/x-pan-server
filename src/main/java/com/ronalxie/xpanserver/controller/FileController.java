package com.ronalxie.xpanserver.controller;


import com.ronalxie.xpanserver.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @Autowired
    private FileService fileService;
}
