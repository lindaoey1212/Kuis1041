-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.51
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kuis1041`
--
CREATE DATABASE IF NOT EXISTS `db_kuis1041` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `db_kuis1041`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1041`
--

CREATE TABLE `cv_1041` (
  `kode_cv` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(255) NOT NULL,
  `ttl` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1041`
--

INSERT INTO `cv_1041` (`kode_cv`, `alamat`, `nama`, `ttl`) VALUES
(1, 'Jl Setia Dengan Kamu', 'Wini Son', 'Jerman, 17 Agustus 1945'),
(2, 'jl sekolah dasar menengah tengah', 'Mine Jashujan', 'seoul, 25 desember 1995'),
(3, 'jl Halaman Ayang', 'Rachma a Wati', 'London, 28 September 2000SM');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1041`
--

CREATE TABLE `nilai_1041` (
  `kode_nilai` bigint(20) NOT NULL,
  `kode_cv` bigint(20) NOT NULL,
  `matpel` varchar(255) DEFAULT NULL,
  `nilai` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1041`
--

INSERT INTO `nilai_1041` (`kode_nilai`, `kode_cv`, `matpel`, `nilai`) VALUES
(1, 1, 'mat', '80'),
(2, 1, 'mat', '85');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1041`
--
ALTER TABLE `cv_1041`
  ADD PRIMARY KEY (`kode_cv`);

--
-- Indexes for table `nilai_1041`
--
ALTER TABLE `nilai_1041`
  ADD PRIMARY KEY (`kode_nilai`),
  ADD KEY `FK180e71dv350kpw0x6fvqeh77e` (`kode_cv`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1041`
--
ALTER TABLE `cv_1041`
  MODIFY `kode_cv` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nilai_1041`
--
ALTER TABLE `nilai_1041`
  MODIFY `kode_nilai` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1041`
--
ALTER TABLE `nilai_1041`
  ADD CONSTRAINT `FK180e71dv350kpw0x6fvqeh77e` FOREIGN KEY (`kode_cv`) REFERENCES `cv_1041` (`kode_cv`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
