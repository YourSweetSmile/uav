/*
 Navicat Premium Data Transfer

 Source Server         : 106.13.113.35
 Source Server Type    : MySQL
 Source Server Version : 50173
 Source Host           : 106.13.113.35:3306
 Source Schema         : uavms

 CHARSET               : utf8
 排序规则                : utf8_general_ci

 Target Server Type    : MySQL
 Target Server Version : 50173
 File Encoding         : 65001

 Date: 21/05/2019 18:55:30
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ent_city
-- ----------------------------
DROP TABLE IF EXISTS `ent_city`;
CREATE TABLE `ent_city` (
  `city_id` varchar(15) NOT NULL COMMENT '地市编码',
  `city_name` varchar(15) NOT NULL COMMENT '地市名称',
  `zone_code` varchar(15) NOT NULL COMMENT '区号',
  `city_code` varchar(15) NOT NULL COMMENT '城市编码',
  `province_id` tinyint(4) NOT NULL COMMENT '省id',
  PRIMARY KEY (`city_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_city
-- ----------------------------
BEGIN;
INSERT INTO `ent_city` VALUES ('A', '福州市', '0591', '350100', 1);
INSERT INTO `ent_city` VALUES ('B', '厦门市', '0592', '350200', 1);
INSERT INTO `ent_city` VALUES ('C', '泉州市', '0595', '350500', 1);
INSERT INTO `ent_city` VALUES ('D', '漳州市', '0596', '350600', 1);
INSERT INTO `ent_city` VALUES ('E', '宁德市', '0593', '350900', 1);
INSERT INTO `ent_city` VALUES ('F', '莆田市', '0594', '350300', 1);
INSERT INTO `ent_city` VALUES ('G', '南平市', '0599', '350700', 1);
INSERT INTO `ent_city` VALUES ('H', '三明市', '0598', '350400', 1);
INSERT INTO `ent_city` VALUES ('I', '龙岩市', '0597', '350800', 1);
COMMIT;

-- ----------------------------
-- Table structure for ent_county
-- ----------------------------
DROP TABLE IF EXISTS `ent_county`;
CREATE TABLE `ent_county` (
  `district_id` varchar(15) NOT NULL COMMENT '区县编码',
  `district_name` varchar(15) NOT NULL COMMENT '区县名称',
  `city_id` varchar(4) NOT NULL COMMENT '地市编码',
  PRIMARY KEY (`district_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_county
-- ----------------------------
BEGIN;
INSERT INTO `ent_county` VALUES ('A01', '鼓楼区', 'A');
INSERT INTO `ent_county` VALUES ('A02', '晋安区', 'A');
INSERT INTO `ent_county` VALUES ('A03', '台江区', 'A');
INSERT INTO `ent_county` VALUES ('A21', '仓山区', 'A');
INSERT INTO `ent_county` VALUES ('A22', '马尾区', 'A');
INSERT INTO `ent_county` VALUES ('A41', '福清区', 'A');
INSERT INTO `ent_county` VALUES ('A42', '长乐区', 'A');
INSERT INTO `ent_county` VALUES ('A43', '连江县', 'A');
INSERT INTO `ent_county` VALUES ('A44', '平潭县', 'A');
INSERT INTO `ent_county` VALUES ('A45', '罗源县', 'A');
INSERT INTO `ent_county` VALUES ('B41', '思明区', 'B');
INSERT INTO `ent_county` VALUES ('B42', '同安区', 'B');
INSERT INTO `ent_county` VALUES ('B43', '集美区', 'B');
INSERT INTO `ent_county` VALUES ('B44', '湖里区', 'B');
INSERT INTO `ent_county` VALUES ('B45', '翔安区', 'B');
INSERT INTO `ent_county` VALUES ('B46', '海沧区', 'B');
INSERT INTO `ent_county` VALUES ('C41', '晋江市', 'C');
INSERT INTO `ent_county` VALUES ('C42', '石狮市', 'C');
INSERT INTO `ent_county` VALUES ('C43', '南安市', 'C');
INSERT INTO `ent_county` VALUES ('C45', '惠安县', 'C');
INSERT INTO `ent_county` VALUES ('C46', '安溪县', 'C');
INSERT INTO `ent_county` VALUES ('C47', '永春县', 'C');
INSERT INTO `ent_county` VALUES ('C48', '德化县', 'C');
INSERT INTO `ent_county` VALUES ('C49', '泉港区', 'C');
INSERT INTO `ent_county` VALUES ('D41', '漳浦县', 'D');
INSERT INTO `ent_county` VALUES ('D42', '云霄县', 'D');
INSERT INTO `ent_county` VALUES ('D43', '东山县', 'D');
INSERT INTO `ent_county` VALUES ('D44', '诏安县', 'D');
INSERT INTO `ent_county` VALUES ('D45', '平和县', 'D');
INSERT INTO `ent_county` VALUES ('D46', '南靖县', 'D');
INSERT INTO `ent_county` VALUES ('D47', '长泰县', 'D');
INSERT INTO `ent_county` VALUES ('D48', '华安县', 'D');
INSERT INTO `ent_county` VALUES ('D49', '龙海市', 'D');
INSERT INTO `ent_county` VALUES ('D50', '芗城区', 'D');
INSERT INTO `ent_county` VALUES ('D51', '龙文区', 'D');
INSERT INTO `ent_county` VALUES ('E00', '蕉城区', 'E');
INSERT INTO `ent_county` VALUES ('E40', '福安市', 'E');
INSERT INTO `ent_county` VALUES ('E41', '福鼎市', 'E');
INSERT INTO `ent_county` VALUES ('E42', '霞浦县', 'E');
INSERT INTO `ent_county` VALUES ('E43', '古田县', 'E');
INSERT INTO `ent_county` VALUES ('E44', '周宁县', 'E');
INSERT INTO `ent_county` VALUES ('E45', '屏南县', 'E');
INSERT INTO `ent_county` VALUES ('E46', '寿宁县', 'E');
INSERT INTO `ent_county` VALUES ('E47', '柘荣县', 'E');
INSERT INTO `ent_county` VALUES ('F02', '荔城区', 'F');
INSERT INTO `ent_county` VALUES ('F41', '涵江区', 'F');
INSERT INTO `ent_county` VALUES ('F42', '秀屿区', 'F');
INSERT INTO `ent_county` VALUES ('F43', '仙游县', 'F');
INSERT INTO `ent_county` VALUES ('G41', '光泽县', 'G');
INSERT INTO `ent_county` VALUES ('G42', '建瓯市', 'G');
INSERT INTO `ent_county` VALUES ('G43', '建阳市', 'G');
INSERT INTO `ent_county` VALUES ('G44', '浦城县', 'G');
INSERT INTO `ent_county` VALUES ('G45', '顺昌县', 'G');
INSERT INTO `ent_county` VALUES ('G46', '邵武市', 'G');
INSERT INTO `ent_county` VALUES ('G47', '松溪县', 'G');
INSERT INTO `ent_county` VALUES ('G48', '武夷山市', 'G');
INSERT INTO `ent_county` VALUES ('G49', '政和县', 'G');
INSERT INTO `ent_county` VALUES ('G50', '延平区', 'G');
INSERT INTO `ent_county` VALUES ('H01', '梅列区', 'H');
INSERT INTO `ent_county` VALUES ('H02', '三元区', 'H');
INSERT INTO `ent_county` VALUES ('H40', '永安市', 'H');
INSERT INTO `ent_county` VALUES ('H41', '沙县', 'H');
INSERT INTO `ent_county` VALUES ('H42', '大田县', 'H');
INSERT INTO `ent_county` VALUES ('H43', '尤溪县', 'H');
INSERT INTO `ent_county` VALUES ('H44', '宁化县', 'H');
INSERT INTO `ent_county` VALUES ('H45', '清流县', 'H');
INSERT INTO `ent_county` VALUES ('H46', '明溪县', 'H');
INSERT INTO `ent_county` VALUES ('H47', '将乐县', 'H');
INSERT INTO `ent_county` VALUES ('H48', '泰宁县', 'H');
INSERT INTO `ent_county` VALUES ('H49', '建宁县', 'H');
INSERT INTO `ent_county` VALUES ('I00', '新罗区', 'I');
INSERT INTO `ent_county` VALUES ('I43', '上杭县', 'I');
INSERT INTO `ent_county` VALUES ('I44', '武平县', 'I');
INSERT INTO `ent_county` VALUES ('I45', '永定县', 'I');
COMMIT;

-- ----------------------------
-- Table structure for ent_device
-- ----------------------------
DROP TABLE IF EXISTS `ent_device`;
CREATE TABLE `ent_device` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `device_type` varchar(20) NOT NULL COMMENT '设备类型',
  `task_type_id` smallint(6) NOT NULL COMMENT '可执行任务[''微型'', ''微型'', ''中型'', ''大型'']\n',
  `device_status` varchar(20) NOT NULL COMMENT '[1飞行中, 2待命中, 3充电中, 4故障中, 5维修中, 6离线中, 7电量低, 8已停用]',
  `device_num` varchar(255) NOT NULL COMMENT '设备编号',
  `device_name` varchar(255) NOT NULL COMMENT '设备名称',
  `device_comm` varchar(1000) DEFAULT NULL COMMENT '设备简介',
  `device_desc` text COMMENT '设备描述',
  `power_max` int(11) NOT NULL COMMENT '电池容量',
  `capacity` int(11) NOT NULL COMMENT '载重量',
  `fly_mileage` int(11) NOT NULL COMMENT '可飞行距离',
  `wind_res` decimal(3,2) NOT NULL COMMENT '抗风系数',
  `water_res` decimal(3,2) NOT NULL COMMENT '抗水系数',
  `hit_res` decimal(3,2) NOT NULL COMMENT '防撞击系数',
  `flexibility` decimal(3,2) NOT NULL COMMENT '灵活系数',
  `emc_res` decimal(3,2) NOT NULL COMMENT '抗电磁干扰系数',
  `img_id` smallint(6) DEFAULT NULL COMMENT '图片文件id',
  `wing_loss` decimal(3,2) NOT NULL COMMENT '机翼损耗率',
  `power_loss` decimal(3,2) NOT NULL COMMENT '电池损耗率',
  `camera_loss` decimal(3,2) NOT NULL COMMENT '摄像机损耗率',
  `pack_loss` decimal(3,2) NOT NULL COMMENT '机舱损耗率',
  `engine_loss` decimal(3,2) NOT NULL COMMENT '引擎损耗率',
  `base_loss` decimal(3,2) NOT NULL COMMENT '底座损耗率',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '出厂时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_device
-- ----------------------------
BEGIN;
INSERT INTO `ent_device` VALUES (1, '小型', 2, '11', '1', '1', '1', '1', 1111, 111, 111, 0.60, 0.60, 0.60, 0.60, 0.60, 1, 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-20 17:51:28');
COMMIT;

-- ----------------------------
-- Table structure for ent_location
-- ----------------------------
DROP TABLE IF EXISTS `ent_location`;
CREATE TABLE `ent_location` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `location_name` varchar(255) NOT NULL COMMENT '地点名称',
  `county_id` varchar(20) NOT NULL COMMENT '区县ID',
  `longitude` decimal(7,4) NOT NULL COMMENT '经度',
  `latitude` decimal(7,4) NOT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_location
-- ----------------------------
BEGIN;
INSERT INTO `ent_location` VALUES (1, '福州大学', 'A01', 20.0000, 30.0000);
INSERT INTO `ent_location` VALUES (2, '师范', 'A02', 30.0000, 40.0000);
COMMIT;

-- ----------------------------
-- Table structure for ent_province
-- ----------------------------
DROP TABLE IF EXISTS `ent_province`;
CREATE TABLE `ent_province` (
  `province_id` tinyint(4) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `province_name` varchar(255) NOT NULL COMMENT '省名称',
  PRIMARY KEY (`province_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_province
-- ----------------------------
BEGIN;
INSERT INTO `ent_province` VALUES (1, '福建省');
INSERT INTO `ent_province` VALUES (2, '江西省');
COMMIT;

-- ----------------------------
-- Table structure for ent_route
-- ----------------------------
DROP TABLE IF EXISTS `ent_route`;
CREATE TABLE `ent_route` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `route_no` varchar(20) NOT NULL COMMENT '路线编号',
  `route_name` varchar(20) NOT NULL COMMENT '路线名称',
  `route_leave` smallint(6) NOT NULL COMMENT '出发地点',
  `route_arrival` smallint(6) NOT NULL COMMENT '到达地点',
  `route_start` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '路线启用时间',
  `route_end` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '路线停用时间',
  `is_delete` char(1) NOT NULL COMMENT '删除状态，0：未删除，1：删除',
  `route_status` char(1) NOT NULL COMMENT '路线状态，t:启用,f:停用',
  `task_type_id` smallint(6) NOT NULL COMMENT '任务类型id',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_route
-- ----------------------------
BEGIN;
INSERT INTO `ent_route` VALUES (1, '11', '坎坎坷坷', 1, 2, '2019-05-15 20:38:58', '2019-05-20 20:39:03', '0', 't', 2);
INSERT INTO `ent_route` VALUES (2, '11111', '22222', 1, 1, '2019-05-03 19:00:00', '2019-05-03 19:00:00', '0', 't', 1);
INSERT INTO `ent_route` VALUES (3, '11111', '22222', 1, 1, '2019-05-03 19:00:00', '2019-05-03 19:00:00', '0', 'f', 1);
INSERT INTO `ent_route` VALUES (4, '11111', '22222', 1, 1, '2019-05-03 19:00:00', '2019-05-03 19:00:00', '0', 't', 1);
INSERT INTO `ent_route` VALUES (5, '11111', '22222', 1, 1, '2019-05-03 19:00:00', '2019-05-03 19:00:00', '0', 't', 1);
INSERT INTO `ent_route` VALUES (6, '11111', '22222', 1, 1, '2019-05-03 19:00:00', '2019-05-03 19:00:00', '0', 't', 1);
INSERT INTO `ent_route` VALUES (7, '11111', '333333', 1, 1, '2019-05-03 19:00:00', '2019-05-03 19:00:00', '0', 'f', 1);
INSERT INTO `ent_route` VALUES (8, '1122222111', '44444444444', 1, 1, '2019-05-03 19:00:00', '2019-05-03 19:00:00', '0', 'f', 1);
INSERT INTO `ent_route` VALUES (9, '55555555', '5555555', 1, 1, '2019-05-03 19:00:00', '2019-05-03 19:00:00', '0', 't', 1);
INSERT INTO `ent_route` VALUES (10, '77777', '888888', 1, 1, '2019-05-03 19:00:00', '2019-05-03 19:00:00', '0', 'f', 1);
INSERT INTO `ent_route` VALUES (11, '77777', '66666666', 1, 1, '2019-05-03 19:00:00', '2019-05-03 19:00:00', '0', 't', 1);
COMMIT;

-- ----------------------------
-- Table structure for ent_task
-- ----------------------------
DROP TABLE IF EXISTS `ent_task`;
CREATE TABLE `ent_task` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `task_name` varchar(20) NOT NULL DEFAULT '1' COMMENT '任务名称',
  `task_type_id` tinyint(4) NOT NULL DEFAULT '1' COMMENT '任务类型id',
  `device_id` smallint(6) NOT NULL DEFAULT '1' COMMENT '设备id',
  `task_build_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '任务创建时间',
  `task_start_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '任务执行时间',
  `task_end_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '任务完成时间',
  `rode_id` smallint(6) NOT NULL DEFAULT '1' COMMENT '路线id',
  `task_status` char(1) NOT NULL DEFAULT 'a' COMMENT 'a未执行，b执行中，c已完成，d已取消，e超时完成',
  `is_delete` char(1) NOT NULL DEFAULT '0' COMMENT '0:未删除，1:删除',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_task
-- ----------------------------
BEGIN;
INSERT INTO `ent_task` VALUES (1, '宁德线', 4, 4, '2019-05-21 19:37:17', '2019-05-22 00:00:00', '2019-05-21 19:37:35', 4, 'c', '0');
INSERT INTO `ent_task` VALUES (2, '宁德线', 2, 2, '2019-05-21 19:37:17', '2019-05-21 19:37:31', '2019-05-21 19:37:35', 2, 'c', '0');
INSERT INTO `ent_task` VALUES (3, '莆田线', 3, 3, '2019-05-21 19:37:17', '2019-05-21 19:37:31', '2019-05-21 19:37:35', 3, 'c', '0');
INSERT INTO `ent_task` VALUES (4, '南平线', 3, 3, '2019-05-13 19:38:38', '2019-05-21 19:38:41', '2019-05-22 19:39:06', 3, 'd', '0');
INSERT INTO `ent_task` VALUES (5, '漳州线', 4, 4, '2019-05-21 19:40:36', '2019-05-21 19:40:40', '2019-05-21 19:41:06', 4, 'e', '0');
INSERT INTO `ent_task` VALUES (6, '三明线', 5, 5, '2019-05-14 19:42:40', '2019-05-21 19:42:44', '2019-05-22 19:42:47', 5, 'f', '1');
INSERT INTO `ent_task` VALUES (7, '泉州线', 6, 6, '2019-05-06 19:43:28', '2019-05-21 19:43:31', '2019-05-23 19:43:34', 6, 'a', '0');
INSERT INTO `ent_task` VALUES (8, '泉州线', 2, 2, '2019-05-14 19:44:56', '2019-05-22 19:45:02', '2019-05-22 19:45:05', 7, 'b', '1');
INSERT INTO `ent_task` VALUES (9, '龙岩线', 4, 5, '2019-05-22 19:46:47', '2019-05-21 19:46:51', '2019-05-15 19:46:55', 8, 'c', '0');
INSERT INTO `ent_task` VALUES (10, '厦门线', 5, 3, '2019-05-07 19:48:07', '2019-05-15 19:48:15', '2019-05-17 19:48:19', 5, 'd', '0');
INSERT INTO `ent_task` VALUES (11, '宁德线', 2, 2, '2019-05-21 19:37:17', '2019-05-21 19:37:31', '2019-05-21 19:37:35', 2, 'c', '0');
INSERT INTO `ent_task` VALUES (13, 'erhaoxian', 12, 3, '2019-05-21 06:37:17', '2019-05-21 06:37:17', '2019-05-21 07:37:17', 5, 'a', '0');
INSERT INTO `ent_task` VALUES (14, 'erhaoxian', 12, 3, '2019-05-21 06:37:17', '2019-05-21 06:37:17', '2019-05-21 07:37:17', 5, 'a', '0');
INSERT INTO `ent_task` VALUES (15, '宁德线', 2, 2, '2019-05-21 19:37:17', '2019-05-21 19:37:31', '2019-05-21 19:37:35', 2, 'c', '0');
INSERT INTO `ent_task` VALUES (16, '1', 1, 1, '2019-05-21 14:21:12', '2019-05-21 14:21:12', '2019-05-21 14:21:12', 1, 'a', '0');
INSERT INTO `ent_task` VALUES (17, '1', 2, 2, '2019-05-21 14:21:54', '2019-05-21 14:21:54', '2019-05-21 14:21:54', 2, 'a', '0');
INSERT INTO `ent_task` VALUES (18, '1', 2, 2, '2019-05-21 14:25:44', '2019-05-21 14:25:44', '2019-05-21 14:25:44', 2, 'a', '0');
INSERT INTO `ent_task` VALUES (19, 'erhaoxian', 12, 3, '2019-05-21 06:37:17', '2019-05-21 06:37:17', '2019-05-21 07:37:17', 5, 'a', '0');
INSERT INTO `ent_task` VALUES (20, '1', 3, 3, '2019-05-21 14:49:07', '2019-05-21 11:00:00', '2019-05-21 14:49:07', 3, 'a', '0');
INSERT INTO `ent_task` VALUES (21, '1', 3, 3, '2019-05-21 15:34:13', '2019-05-22 00:00:00', '2019-05-21 15:34:13', 3, 'a', '0');
INSERT INTO `ent_task` VALUES (22, '33', 3, 3, '2019-05-21 15:48:54', '2019-05-21 15:48:56', '2019-05-21 15:48:58', 1, 'a', '0');
INSERT INTO `ent_task` VALUES (23, '44', 4, 4, '2019-05-21 15:49:09', '2019-05-21 15:49:11', '2019-05-21 15:49:13', 1, 'a', '0');
INSERT INTO `ent_task` VALUES (24, '55', 5, 5, '2019-05-21 15:49:50', '2019-05-21 15:49:52', '2019-05-21 15:49:54', 1, 'a', '0');
COMMIT;

-- ----------------------------
-- Table structure for ent_task_type
-- ----------------------------
DROP TABLE IF EXISTS `ent_task_type`;
CREATE TABLE `ent_task_type` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `type_name` varchar(50) NOT NULL COMMENT '类型名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_task_type
-- ----------------------------
BEGIN;
INSERT INTO `ent_task_type` VALUES (1, '消防');
INSERT INTO `ent_task_type` VALUES (2, '医疗');
INSERT INTO `ent_task_type` VALUES (3, '交通');
INSERT INTO `ent_task_type` VALUES (4, '物流');
INSERT INTO `ent_task_type` VALUES (5, '巡警');
INSERT INTO `ent_task_type` VALUES (6, '其他');
COMMIT;

-- ----------------------------
-- Table structure for rel_device_trouble
-- ----------------------------
DROP TABLE IF EXISTS `rel_device_trouble`;
CREATE TABLE `rel_device_trouble` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `trouble_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '故障日期',
  `device_id` smallint(6) NOT NULL COMMENT '设备ID',
  `task_id` smallint(6) DEFAULT NULL COMMENT '任务ID',
  `trouble_type` varchar(20) NOT NULL COMMENT '故障类型',
  `trouble_reason` varchar(200) DEFAULT NULL COMMENT '故障原因',
  `is_delete` varchar(1) DEFAULT NULL COMMENT '是否删除，0代表没有删除，1代表删除',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rel_device_trouble
-- ----------------------------
BEGIN;
INSERT INTO `rel_device_trouble` VALUES (1, '2016-05-21 03:14:06', 1, 5, '电机故障', '电机损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (2, '2016-05-21 07:57:55', 2, 6, '机械故障', '机械损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (3, '2016-05-25 07:58:47', 3, 7, '电源故障', '电源损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (4, '2019-09-21 07:59:34', 4, 8, '电源故障', NULL, NULL);
INSERT INTO `rel_device_trouble` VALUES (5, '2014-05-21 08:00:15', 5, 9, '底座故障', NULL, NULL);
INSERT INTO `rel_device_trouble` VALUES (6, '2017-08-21 08:00:22', 6, 10, '电源故障', NULL, NULL);
INSERT INTO `rel_device_trouble` VALUES (7, '2012-10-21 08:00:27', 7, 11, '机械故障', NULL, NULL);
INSERT INTO `rel_device_trouble` VALUES (8, '2007-05-21 08:00:32', 8, 12, '电源故障', NULL, NULL);
INSERT INTO `rel_device_trouble` VALUES (9, '2015-08-25 08:00:36', 9, 13, '电机故障', NULL, NULL);
INSERT INTO `rel_device_trouble` VALUES (10, '2009-10-23 08:00:42', 10, 14, '电源故障', NULL, NULL);
INSERT INTO `rel_device_trouble` VALUES (11, '2015-02-06 08:00:49', 11, 15, '电机故障', NULL, NULL);
INSERT INTO `rel_device_trouble` VALUES (12, '2010-11-21 08:00:59', 12, 16, '电源故障', NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for sys_uav_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_uav_user`;
CREATE TABLE `sys_uav_user` (
  `user_id` smallint(6) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(100) NOT NULL DEFAULT 'none' COMMENT '用户姓名',
  `user_date` date NOT NULL COMMENT '日期',
  `user_privileges` varchar(20) NOT NULL DEFAULT '普通用户' COMMENT '用户权限',
  `user_sex` varchar(20) NOT NULL DEFAULT '' COMMENT '用户性别',
  `user_company` varchar(20) NOT NULL DEFAULT '无' COMMENT '用户来源的公司',
  `user_telephone` char(11) NOT NULL DEFAULT '10010' COMMENT '用户联系号码',
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_uav_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_uav_user` VALUES (2, '77777777', '2018-08-02', '普通用户', '男', '常见的', '12345678');
INSERT INTO `sys_uav_user` VALUES (3, 'v造成不便', '2019-05-16', '管理员', '女', '基础上比较', '456783456');
INSERT INTO `sys_uav_user` VALUES (4, 'v造成不便', '2019-05-16', '管理员', '女', '基础上比较', '456783456');
INSERT INTO `sys_uav_user` VALUES (5, 'v造成不便', '2019-05-16', '管理员', '女', '基础上比较', '456783456');
INSERT INTO `sys_uav_user` VALUES (6, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
