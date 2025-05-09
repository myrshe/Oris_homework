package org.jetbrains.homework_2sem.services;

import org.jetbrains.homework_2sem.dto.UserForm;
import freemarker.template.TemplateException;

import java.io.IOException;

public interface SignUpService {
    public void addUser(UserForm userForm) throws TemplateException, IOException;
}
