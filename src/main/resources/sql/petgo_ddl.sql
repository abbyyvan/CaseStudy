DROP TABLE IF EXISTS `application`;

CREATE TABLE `application` (
  `application_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`application_id`),
  KEY `FKldca8xj6lqb3rsqawrowmkqbg` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;





DROP TABLE IF EXISTS `application_detail`;

CREATE TABLE `application_detail` (
  `id` bigint(20) NOT NULL,
  `application_application_id` bigint(20) DEFAULT NULL,
  `pet_id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`pet_id`),
  KEY `FKg3mnaiet0yt8mpxmggwr5u5wi` (`application_application_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;




DROP TABLE IF EXISTS `pet`;

CREATE TABLE `pet` (
  `pet_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `pet_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pet_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

INSERT INTO `pet` (`pet_id`, `description`, `name`, `image_url`)
VALUES
	(1,'description:first dog','Jones1',NULL),
	(2,'description:second dog','Jones2',NULL),
	(3,'description:third dog','Jones3',NULL),
	(4,'description:fourth dog','Jones4',NULL),
	(5,'description:fifth dog','Jones5',NULL);

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;




DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;




DROP TABLE IF EXISTS `user_application_list`;

CREATE TABLE `user_application_list` (
  `user_user_id` bigint(20) NOT NULL,
  `application_list_application_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_rus9cdb8ocshy3lw3198rc87d` (`application_list_application_id`),
  KEY `FKf5tnarbn04fw2r96jop96mp7t` (`user_user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

