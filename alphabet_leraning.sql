-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 09, 2019 at 12:59 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `alphabet_leraning`
--

-- --------------------------------------------------------

--
-- Table structure for table `alphabet`
--

CREATE TABLE `alphabet` (
  `letter` varchar(2) NOT NULL,
  `word` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alphabet`
--

INSERT INTO `alphabet` (`letter`, `word`) VALUES
('A', 'apple'),
('A', 'arrow'),
('A', 'axe'),
('A', 'ARM'),
('B', 'BALL'),
('B', 'BANANA'),
('B', 'BOY'),
('B', 'BELL'),
('B', 'BOAT'),
('C', 'CAR'),
('C', 'CAT'),
('C', 'COW'),
('C', 'CAMEL'),
('D', 'DOG'),
('D', 'DUCK'),
('D', 'DEER'),
('D', 'DRUM'),
('D', 'DINOSAUR'),
('C', 'CAKE'),
('E', 'EGG'),
('E', 'EYE'),
('E', 'EAGLE'),
('E', 'EAR'),
('E', 'ELEPHANT'),
('F', 'FAN'),
('F', 'FISH'),
('F', 'FAIRY'),
('F', 'FLOWER'),
('F', 'FLAG'),
('G', 'GIRL'),
('G', 'GATE'),
('G', 'GUN'),
('G', 'GOAT'),
('G', 'GRAPES'),
('H', 'HAT'),
('H', 'HEN'),
('H', 'HOUSE'),
('H', 'HORN'),
('H', 'HORSE'),
('I', 'IRON'),
('I', 'IGLOO'),
('I', 'INK'),
('I', 'ICE-CREAM'),
('I', 'INSECTS'),
('J', 'JAM'),
('J', 'JOKER'),
('J', 'JEEP'),
('J', 'JUG'),
('J', 'JUICE'),
('K', 'KEY'),
('K', 'KING'),
('K', 'KNIFE'),
('K', 'KITE'),
('K', 'KETTLE'),
('L', 'LAMP'),
('L', 'LEAF'),
('L', 'LOTUS'),
('L', 'LION'),
('M', 'MAT'),
('M', 'MOON'),
('M', 'MANGO'),
('M', 'MASK'),
('M', 'MOUSE'),
('N', 'NET'),
('N', 'NAIL'),
('N', 'NEST'),
('N', 'NURSE'),
('O', 'ORANG'),
('O', 'ONION'),
('O', 'OVEN'),
('O', 'OWL'),
('O', 'ORCHID'),
('P', 'PLANT'),
('P', 'PARROT'),
('P', 'PEACOOK'),
('P', 'PANDA'),
('P', 'PIANO'),
('Q', 'QUEEN'),
('Q', 'QUAIL'),
('Q', 'QUILT'),
('Q', 'QUARTER'),
('Q', 'QUESTION'),
('R', 'RAT'),
('R', 'ROSE'),
('R', 'RING'),
('R', 'ROBOT'),
('R', 'RADIO'),
('S', 'SUN'),
('S', 'SPOON'),
('S', 'SHIP'),
('S', 'SHEEP'),
('S', 'STAR'),
('T', 'TOY'),
('T', 'TENT'),
('T', 'TIGER'),
('T', 'TOMATO'),
('T', 'TABLE'),
('U', 'UMBRELLA'),
('U', 'UNCLE'),
('U', 'UMPIRE'),
('U', 'UNHAPPY'),
('U', 'UNDER'),
('V', 'VAN'),
('V', 'VEST'),
('V', 'VASE'),
('V', 'VIOLIN'),
('V', 'VEGETABLE'),
('W', 'WALL'),
('W', 'WATCH'),
('W', 'WELL'),
('W', 'WOMAN'),
('X', 'X-RAY'),
('X', 'X-MAS'),
('X', 'XYLOPHONE'),
('Y', 'YOLK'),
('Y', 'yak'),
('Y', 'YARN'),
('Z', 'ZOO'),
('Z', 'ZIP'),
('Z', 'ZEBRA'),
('Z', 'ZERO'),
('Z', 'ZIGZAG'),
('F', 'Facebook'),
('A', 'all'),
('A', 'ABCD'),
('A', 'AAA');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
