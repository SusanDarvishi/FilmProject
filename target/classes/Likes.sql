CREATE TABLE `Likes` (
  `like_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `film_id` int(11) NOT NULL,
  PRIMARY KEY (`like_id`),
  UNIQUE KEY `id_likes_UNIQUE` (`like_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1