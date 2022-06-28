# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.5.5-10.8.3-MariaDB)
# Database: casestudy
# Generation Time: 2022-06-28 02:46:05 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table application
# ------------------------------------------------------------

DROP TABLE IF EXISTS `application`;

CREATE TABLE `application` (
  `application_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pet_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `is_approved` bit(1) NOT NULL,
  PRIMARY KEY (`application_id`),
  KEY `FKm5gbftti6ywjfaa08e343fisv` (`pet_id`),
  KEY `FKldca8xj6lqb3rsqawrowmkqbg` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

LOCK TABLES `application` WRITE;
/*!40000 ALTER TABLE `application` DISABLE KEYS */;

INSERT INTO `application` (`application_id`, `pet_id`, `user_id`, `created_at`, `updated_at`, `is_approved`)
VALUES
	(1,1,2,NULL,NULL,b'0');

/*!40000 ALTER TABLE `application` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table pet
# ------------------------------------------------------------

DROP TABLE IF EXISTS `pet`;

CREATE TABLE `pet` (
  `pet_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `imgurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pet_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

LOCK TABLES `pet` WRITE;
/*!40000 ALTER TABLE `pet` DISABLE KEYS */;

INSERT INTO `pet` (`pet_id`, `description`, `image_url`, `name`, `age`, `created_at`, `updated_at`, `imgurl`)
VALUES
	(1,'description:first dog','https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60','Jones1sdfa','2yr',NULL,'2022-06-28 02:41:58','https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60'),
	(2,'description:second dog',NULL,'Jones2','3yr ',NULL,'2022-06-27 20:51:41',NULL),
	(3,'description:third dog',NULL,'Jones3','1 yr',NULL,'2022-06-27 20:51:48',NULL),
	(4,'description:fourth dog',NULL,'Jones4','6 mon',NULL,'2022-06-27 20:51:53',NULL),
	(8,'dsdada',NULL,'dasdsds','121','2022-06-27 21:20:02','2022-06-27 21:20:02',NULL),
	(9,'A black cat','https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60','abby','23','2022-06-27 23:21:46','2022-06-27 23:21:46','https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60'),
	(10,NULL,'https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60','lily','2','2022-06-28 02:09:53','2022-06-28 02:09:53','https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60'),
	(11,NULL,'https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60','lily','2','2022-06-28 02:37:46','2022-06-28 02:37:46','https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60'),
	(12,'sssda','https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60','dadsad','1','2022-06-28 02:40:48','2022-06-28 02:40:48','https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGRvZ3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60');

/*!40000 ALTER TABLE `pet` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table roles
# ------------------------------------------------------------

DROP TABLE IF EXISTS `roles`;

CREATE TABLE `roles` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;

INSERT INTO `roles` (`role_id`, `role`)
VALUES
	(1,'Admin'),
	(2,'USER');

/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role_role_id` bigint(20) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FK4keqlw3ucfmfsbeu8r1ijdppf` (`role_role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` (`user_id`, `email`, `password`, `role_role_id`, `username`)
VALUES
	(1,'kkkk@admin.com','aaaaaaaaaaaa',NULL,NULL),
	(2,'499965776@qq.com',NULL,NULL,NULL),
	(3,'abby@gmail.com','abby2022',NULL,NULL),
	(4,'yvan@gmail.com','yvan2022',NULL,NULL),
	(8,'admin@admin.com','admin12',NULL,NULL),
	(9,'kkkk@admin.com','aaasasa',NULL,NULL),
	(10,'admin@admin.com','admin12',NULL,NULL),
	(11,'cgchgf@m','admin12',NULL,NULL),
	(12,'admin@admin.com','admin12',NULL,NULL),
	(13,'adadsada@das.com',NULL,NULL,NULL),
	(14,'admin@admin.com',NULL,NULL,NULL),
	(15,'admin@admin.com',NULL,NULL,NULL),
	(16,'yvan@gmail.com','yvan2022',NULL,NULL),
	(18,'yvan@gmail.com','yvan2022',NULL,NULL),
	(19,'yvan@gmail.com','yvan2022',NULL,NULL),
	(21,'yvan@gmail.com','yvan2022',NULL,NULL),
	(22,'admin@adeqeqin.com','aeweq2',NULL,NULL),
	(23,'qwe@qqeqe.com',NULL,NULL,NULL);

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
