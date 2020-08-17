/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for hotel
CREATE DATABASE IF NOT EXISTS `hotel` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `hotel`;

-- Dumping structure for table hotel.booking
CREATE TABLE IF NOT EXISTS `booking` (
  `book_id` int(3) unsigned NOT NULL AUTO_INCREMENT,
  `room_no` varchar(3) DEFAULT NULL,
  `arrival` datetime DEFAULT NULL,
  `departure` datetime DEFAULT NULL,
  `total_days` int(3) DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  KEY `fk_booking_rooms` (`room_no`),
  CONSTRAINT `fk_booking_rooms` FOREIGN KEY (`room_no`)
  REFERENCES `rooms` (`room_no`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

-- Dumping structure for table hotel.rooms
CREATE TABLE IF NOT EXISTS `rooms` (
  `room_no` varchar(3) NOT NULL,
  `room_type` varchar(10) NOT NULL,
  `room_rate` int(4) NOT NULL,
  `room_bed` varchar(6) NOT NULL,
  PRIMARY KEY (`room_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` (`room_no`, `room_type`, `room_rate`, `room_bed`) VALUES
	('101', 'Non AC', 700, 'Single'),
	('102', 'Non AC', 700, 'Single'),
	('103', 'Non AC', 700, 'Single'),
	('104', 'Non AC', 700, 'Single'),
	('105', 'Non AC', 700, 'Single'),
	('106', 'Non AC', 700, 'Single'),
	('107', 'Non AC', 700, 'Single'),
	('108', 'Non AC', 700, 'Single'),
	('109', 'Non AC', 700, 'Single'),
	('110', 'Non AC', 700, 'Single'),
	('111', 'Non AC', 1000, 'Double'),
	('112', 'Non AC', 1000, 'Double'),
	('113', 'Non AC', 1000, 'Double'),
	('114', 'Non AC', 1000, 'Double'),
	('115', 'Non AC', 1000, 'Double'),
	('116', 'AC', 1500, 'Single'),
	('117', 'AC', 1500, 'Single'),
	('118', 'AC', 1500, 'Single'),
	('119', 'AC', 1500, 'Single'),
	('120', 'AC', 1500, 'Single'),
	('121', 'AC', 1500, 'Single'),
	('122', 'AC', 1500, 'Single'),
	('123', 'AC', 1500, 'Single'),
	('124', 'AC', 2000, 'Double'),
	('125', 'AC', 2000, 'Double'),
	('126', 'AC', 2000, 'Double'),
	('127', 'AC', 2000, 'Double'),
	('128', 'AC', 2000, 'Double'),
	('129', 'AC', 2000, 'Double'),
	('130', 'AC', 2000, 'Double');
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;

-- Dumping structure for table hotel.users
CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` varchar(50) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`username`, `password`, `role`, `first_name`, `last_name`, `address`, `contact`) VALUES
	('admin', 'admin', 'admin', 'Super', 'Admin', 'Unknown', 'Unknown');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Dumping structure for table hotel.visitors
CREATE TABLE IF NOT EXISTS `visitors` (
  `visitor_no` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `visitor_name` varchar(30) DEFAULT NULL,
  `visitor_add` varchar(40) DEFAULT NULL,
  `visitor_city` varchar(30) DEFAULT NULL,
  `visitor_state` varchar(30) DEFAULT NULL,
  `visitor_country` varchar(30) DEFAULT NULL,
  `visitor_ph` varchar(10) DEFAULT NULL,
  `visitor_proof` varchar(20) DEFAULT NULL,
  `total_adults` varchar(2) DEFAULT NULL,
  `total_childs` varchar(2) DEFAULT NULL,
  `visitor_mar_stat` varchar(15) DEFAULT NULL,
  `visitor_id_no` varchar(30) DEFAULT NULL,
  `visitor_nation` varchar(30) DEFAULT NULL,
  `visitor_purpos` varchar(30) DEFAULT NULL,
  `visitor_bill` int(5) DEFAULT NULL,
  `book_id` int(3) unsigned NOT NULL,
  PRIMARY KEY (`visitor_no`),
  CONSTRAINT `fk_visitors_booking` FOREIGN KEY (`book_id`)
  REFERENCES `booking` (`book_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
