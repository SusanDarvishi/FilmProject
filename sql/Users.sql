CREATE TABLE `FilmProject`.`Users` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(1000) NOT NULL,
  `password` VARCHAR(1000) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `userId_UNIQUE` (`userId` ASC),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC));
