CREATE TABLE `Films` (
  `film_id` int(11) NOT NULL AUTOINCREMENT,
  `filmname` varchar(45) NOT NULL,
  PRIMARY KEY (`film_id`,`filmname`),
  UNIQUE KEY `film_id_UNIQUE` (`film_id`),
  UNIQUE KEY `filmname_UNIQUE` (`filmname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1