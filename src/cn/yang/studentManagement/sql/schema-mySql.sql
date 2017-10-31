CREATE TABLE `mydb`.`courses` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL COMMENT '课程名称',
  `credit` INT NOT NULL COMMENT '课程学分',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE `mydb`.`teachers` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL COMMENT '教师姓名',
  `age` INT NOT NULL COMMENT '教师年龄',
  `gender` VARCHAR(8) NOT NULL COMMENT '教师性别',
  `email` VARCHAR(45) NOT NULL COMMENT '教师邮箱',
  `mobile` VARCHAR(45) NULL COMMENT '教师手机号',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE `mydb`.`teaching_course` (
  `id` INT(11) NOT NULL,
  `course_id` INT(11) NOT NULL COMMENT '课程id',
  `teacher_id` INT(11) NOT NULL COMMENT '教师id',
  `time` VARCHAR(90) NOT NULL COMMENT '上课时间',
  PRIMARY KEY (`id`),
  INDEX `course_id_idx` (`course_id` ASC),
  INDEX `teacher_id_idx` (`teacher_id` ASC),
  CONSTRAINT `course_id`
    FOREIGN KEY (`course_id`)
    REFERENCES `mydb`.`courses` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `teacher_id`
    FOREIGN KEY (`teacher_id`)
    REFERENCES `mydb`.`teachers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;