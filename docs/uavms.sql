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


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for calendar
-- ----------------------------
DROP TABLE IF EXISTS `calendar`;
CREATE TABLE `calendar` (
  `datelist` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of calendar
-- ----------------------------
BEGIN;
INSERT INTO `calendar` VALUES ('2019-05-27');
INSERT INTO `calendar` VALUES ('2019-04-27');
INSERT INTO `calendar` VALUES ('2019-03-27');
INSERT INTO `calendar` VALUES ('2019-02-27');
INSERT INTO `calendar` VALUES ('2019-01-27');
INSERT INTO `calendar` VALUES ('2018-12-27');
INSERT INTO `calendar` VALUES ('2018-11-27');
INSERT INTO `calendar` VALUES ('2018-10-01');
INSERT INTO `calendar` VALUES ('2018-09-27');
INSERT INTO `calendar` VALUES ('2018-08-27');
INSERT INTO `calendar` VALUES ('2018-07-27');
INSERT INTO `calendar` VALUES ('2018-06-27');
COMMIT;

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
  `device_status` varchar(50) NOT NULL DEFAULT '待命中' COMMENT '[1飞行中, 2待命中, 3充电中, 4故障中, 5维修中, 6离线中, 7电量低, 8已停用]',
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
  `img_url` varchar(100) DEFAULT NULL COMMENT '图片文件url',
  `wing_loss` decimal(3,2) NOT NULL COMMENT '机翼损耗率',
  `power_loss` decimal(3,2) NOT NULL COMMENT '电池损耗率',
  `camera_loss` decimal(3,2) NOT NULL COMMENT '摄像机损耗率',
  `pack_loss` decimal(3,2) NOT NULL COMMENT '机舱损耗率',
  `engine_loss` decimal(3,2) NOT NULL COMMENT '引擎损耗率',
  `base_loss` decimal(3,2) NOT NULL COMMENT '底座损耗率',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '出厂时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_device
-- ----------------------------
BEGIN;
INSERT INTO `ent_device` VALUES (1, '小型', 1, '已停用', '1', '小型无人机', '1', '1', 1111, 111, 111, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:32:13');
INSERT INTO `ent_device` VALUES (2, '小型', 1, '已停用', '12321321q', '测试无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:10');
INSERT INTO `ent_device` VALUES (3, '大型', 1, '待命中', '12321321w', '救援无人机12', '这是一个测试无人机111', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:11');
INSERT INTO `ent_device` VALUES (4, '中型', 2, '待命中', '12321321e', '测绘无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:12');
INSERT INTO `ent_device` VALUES (5, '中型', 2, '待命中', '12321321r', '摄影无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:13');
INSERT INTO `ent_device` VALUES (6, '中型', 2, '待命中', '12321321t', '寻河无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:14');
INSERT INTO `ent_device` VALUES (7, '中型', 3, '待命中', '12321321y', '巡检无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:15');
INSERT INTO `ent_device` VALUES (8, '中型', 4, '已停用', '12321321u', '救援无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:16');
INSERT INTO `ent_device` VALUES (9, '中型', 5, '待命中', '12321321i', '摄影无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:17');
INSERT INTO `ent_device` VALUES (10, '中型', 5, '已停用', '12321321o', '寻河无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:18');
INSERT INTO `ent_device` VALUES (11, '中型', 6, '待命中', '123213213', '救援无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:19');
INSERT INTO `ent_device` VALUES (12, '中型', 3, '待命中', '12321321-k', '巡检无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:20');
INSERT INTO `ent_device` VALUES (13, '微型', 3, '待命中', '12321321m', '摄影无人机', '这是一个测试无人机', '1', 4000, 300, 6000, 0.60, 0.60, 0.60, 0.60, 0.60, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.60, 0.60, 0.60, 0.60, '2019-05-27 19:19:20');
INSERT INTO `ent_device` VALUES (15, '特大型', 3, '待命中', 'num-q23425k09-k', '小型无人机', '1', '这是描述', 3000, 2000, 5, 0.80, 0.60, 0.80, 0.90, 0.30, 'http://file03.16sucai.com/2016/10/1100/16sucai_p20161012101_387.JPG', 0.60, 0.60, 0.20, 0.60, 0.10, 0.60, '2019-05-27 19:19:21');
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
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_location
-- ----------------------------
BEGIN;
INSERT INTO `ent_location` VALUES (1, '福州大学', 'A01', 119.3000, 26.0000);
INSERT INTO `ent_location` VALUES (2, '师范', 'A02', 119.4000, 26.1000);
INSERT INTO `ent_location` VALUES (3, '台江区', 'A03', 119.3000, 26.0700);
INSERT INTO `ent_location` VALUES (4, '仓山区', 'A21', 119.3200, 26.0500);
INSERT INTO `ent_location` VALUES (5, '马尾区', 'A22', 119.4500, 26.0000);
INSERT INTO `ent_location` VALUES (6, '福清区', 'A41', 119.3800, 25.7200);
INSERT INTO `ent_location` VALUES (7, '长乐区', 'A42', 119.5200, 25.9700);
INSERT INTO `ent_location` VALUES (8, '连江县', 'A43', 119.5300, 26.2000);
INSERT INTO `ent_location` VALUES (9, '平潭县', 'A44', 119.7800, 25.5200);
INSERT INTO `ent_location` VALUES (10, '罗源县', 'A45', 119.5500, 26.4800);
INSERT INTO `ent_location` VALUES (11, '思明区', 'B41', 118.0800, 24.4500);
INSERT INTO `ent_location` VALUES (12, '同安区', 'B42', 118.1500, 24.7300);
INSERT INTO `ent_location` VALUES (13, '集美区', 'B43', 118.1000, 24.5700);
INSERT INTO `ent_location` VALUES (14, '湖里区', 'B44', 118.0800, 24.5200);
INSERT INTO `ent_location` VALUES (15, '翔安区', 'B45', 118.2300, 24.6200);
INSERT INTO `ent_location` VALUES (16, '海沧区', 'B46', 117.9800, 24.4700);
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
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_route
-- ----------------------------
BEGIN;
INSERT INTO `ent_route` VALUES (1, '11', '坎坎坷坷11', 1, 1, '2019-05-27 11:40:42', '2019-05-23 00:00:00', '0', 't', 3);
INSERT INTO `ent_route` VALUES (2, '11111', '22222', 2, 2, '2019-05-27 15:27:27', '2019-05-03 19:00:00', '0', 't', 6);
INSERT INTO `ent_route` VALUES (3, '11111', '22222', 3, 3, '2019-05-27 11:40:45', '2019-05-03 19:00:00', '0', 't', 1);
INSERT INTO `ent_route` VALUES (4, '11111', '22222', 1, 4, '2019-05-27 15:27:09', '2019-05-03 19:00:00', '0', 't', 6);
INSERT INTO `ent_route` VALUES (5, '11111', '22222', 3, 5, '2019-05-27 11:40:49', '2019-05-03 19:00:00', '0', 't', 1);
INSERT INTO `ent_route` VALUES (6, '11111', '22222', 1, 6, '2019-05-27 15:27:12', '2019-05-03 19:00:00', '0', 't', 5);
INSERT INTO `ent_route` VALUES (7, '11111', '333333', 4, 7, '2019-05-27 11:40:53', '2019-05-03 19:00:00', '0', 'f', 1);
INSERT INTO `ent_route` VALUES (8, '1122222111', '44444444444', 1, 8, '2019-05-27 15:27:14', '2019-05-03 19:00:00', '0', 'f', 4);
INSERT INTO `ent_route` VALUES (9, '55555555', '5555555', 5, 9, '2019-05-27 11:40:56', '2019-05-03 19:00:00', '0', 't', 1);
INSERT INTO `ent_route` VALUES (10, '77777', '888888', 1, 10, '2019-05-27 15:27:18', '2019-05-03 19:00:00', '0', 't', 5);
INSERT INTO `ent_route` VALUES (11, '77777', '6666666677', 6, 11, '2019-05-27 11:41:01', '2019-05-03 19:00:00', '0', 't', 1);
INSERT INTO `ent_route` VALUES (12, '77777', '333', 1, 12, '2019-05-27 15:27:21', '2019-05-03 19:00:00', '0', 't', 4);
INSERT INTO `ent_route` VALUES (13, '1111122222', '222555522', 1, 13, '2019-05-27 11:41:05', '2019-05-04 08:00:00', '0', 'f', 1);
INSERT INTO `ent_route` VALUES (14, '1558505677578', '新增1修改', 1, 14, '2019-05-27 11:41:07', '2019-05-24 00:00:00', '0', 't', 3);
INSERT INTO `ent_route` VALUES (15, '1558505822836', '新增2修改', 1, 15, '2019-05-27 11:41:10', '2019-05-31 00:00:00', '0', 'f', 1);
INSERT INTO `ent_route` VALUES (16, '1558517973002', '新增', 1, 16, '2019-05-27 11:41:25', '2019-05-24 00:00:00', '0', 't', 3);
INSERT INTO `ent_route` VALUES (17, '1558518007845', '新增', 1, 1, '2019-05-27 11:41:27', '2019-05-24 00:00:00', '0', 't', 3);
INSERT INTO `ent_route` VALUES (18, '1558593149452', '新增2222222', 1, 2, '2019-05-16 00:00:00', '2019-05-24 00:00:00', '0', 'f', 3);
INSERT INTO `ent_route` VALUES (19, '1558924315496', '111', 3, 3, '2019-05-27 00:00:00', '2019-05-29 00:00:00', '0', 't', 2);
INSERT INTO `ent_route` VALUES (20, '1558925685435', '新增路线11111', 1, 1, '2019-05-27 11:41:31', '2019-05-30 00:00:00', '0', 't', 2);
INSERT INTO `ent_route` VALUES (21, '1558927337712', '新增路线2222', 3, 5, '2019-05-27 11:41:33', '2019-05-31 00:00:00', '0', 'f', 1);
INSERT INTO `ent_route` VALUES (22, '1558927367104', '新增路线3333', 5, 6, '2019-05-27 11:41:36', '2019-05-24 00:00:00', '0', 't', 3);
COMMIT;

-- ----------------------------
-- Table structure for ent_task
-- ----------------------------
DROP TABLE IF EXISTS `ent_task`;
CREATE TABLE `ent_task` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `task_name` varchar(20) NOT NULL DEFAULT '1' COMMENT '任务名称',
  `task_type_id` tinyint(4) NOT NULL DEFAULT '1' COMMENT '任务类型id',
  `device_id` smallint(6) DEFAULT '1' COMMENT '设备id',
  `task_build_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '任务创建时间',
  `task_start_time` timestamp NOT NULL DEFAULT '1977-08-01 08:00:00' COMMENT '任务执行时间',
  `task_end_time` timestamp NOT NULL DEFAULT '1978-08-01 08:00:00' COMMENT '任务完成时间',
  `rode_id` smallint(6) NOT NULL DEFAULT '1' COMMENT '路线id',
  `task_status` char(1) NOT NULL DEFAULT 'a' COMMENT 'a未执行，b执行中，c已完成，d已取消/暂停，e超时完成',
  `is_delete` char(1) DEFAULT '0' COMMENT '0:未删除，1:删除',
  `task_header` varchar(20) NOT NULL DEFAULT '王二' COMMENT '负责人',
  `task_desc` varchar(20) NOT NULL DEFAULT '正常运行' COMMENT '任务描述',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=375 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ent_task
-- ----------------------------
BEGIN;
INSERT INTO `ent_task` VALUES (1, '宁德-莆田', 6, 2, '2019-05-27 19:26:18', '2019-05-27 16:53:14', '2019-05-21 19:37:35', 1, 'c', '1', '', '正常运行');
INSERT INTO `ent_task` VALUES (2, '宁德-莆田', 4, 3, '2019-05-27 19:37:25', '2019-05-27 17:04:32', '2019-05-21 19:37:35', 2, 'c', '1', '', '正常运行');
INSERT INTO `ent_task` VALUES (3, '莆田-宁德', 2, 3, '2019-05-27 16:06:42', '2019-05-28 08:37:31', '2019-05-21 19:37:35', 3, 'c', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (4, '南平-宁德', 2, 3, '2019-05-27 16:07:17', '2019-05-28 08:37:31', '2019-05-22 19:39:06', 3, 'c', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (5, '漳州-宁德', 4, 3, '2019-05-24 11:03:53', '2011-04-12 00:00:00', '2019-05-21 19:41:06', 4, 'e', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (6, '三明-宁德', 1, 1, '2019-05-24 13:41:20', '2018-05-01 00:00:00', '2019-05-22 19:42:47', 5, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (7, '泉州-宁德', 5, 3, '2019-05-24 11:04:06', '2015-06-18 00:00:00', '2019-05-23 19:43:34', 6, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (8, '泉州-宁德', 1, 1, '2019-05-24 17:02:46', '2018-12-01 00:00:00', '2019-05-22 19:45:05', 7, 'b', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (9, '龙岩-宁德', 1, 1, '2019-05-24 17:02:39', '2018-08-01 00:00:00', '2019-05-15 19:46:55', 8, 'c', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (10, '厦门-宁德', 5, 2, '2019-05-24 13:43:36', '2018-11-11 00:00:00', '2019-05-17 19:48:19', 5, 'd', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (11, '宁德-宁德', 1, 1, '2019-05-24 17:02:26', '2018-04-01 00:00:00', '2019-05-21 19:37:35', 2, 'c', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (13, '-宁德', 2, 1, '2019-05-24 22:33:10', '2019-05-24 04:00:00', '2019-05-21 07:37:17', 5, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (14, 'erhaoxian-宁德', 4, 3, '2019-05-24 13:43:29', '2018-10-13 00:00:00', '2019-05-21 07:37:17', 5, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (15, '宁德-宁德', 5, 2, '2019-05-24 13:43:32', '2018-06-11 00:00:00', '2019-05-21 19:37:35', 2, 'c', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (16, '1-宁德', 1, 1, '2019-05-24 17:01:40', '2018-07-14 00:00:00', '2019-05-21 14:21:12', 1, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (17, '1-宁德', 1, 1, '2019-05-24 22:12:59', '2019-05-23 00:00:00', '2019-05-21 14:21:54', 2, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (18, '1-宁德', 4, 1, '2019-05-24 22:21:04', '2019-05-20 00:00:00', '2019-05-21 14:25:44', 2, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (19, 'erhaoxian-宁德', 1, 1, '2019-05-24 10:37:33', '2017-05-01 00:00:00', '2019-05-21 07:37:17', 5, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (20, '1', 4, 4, '2019-05-24 11:04:55', '2016-06-16 00:00:00', '2019-05-21 14:49:07', 3, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (21, '1', 5, 1, '2019-05-24 22:21:27', '2019-05-26 00:00:00', '2019-05-21 15:34:13', 3, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (22, '33', 1, 1, '2019-05-24 22:08:09', '2019-01-01 00:00:00', '2019-05-21 15:48:58', 1, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (23, '44', 1, 1, '2019-05-27 10:37:33', '2017-05-01 00:00:00', '2019-05-21 15:49:13', 1, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (24, '55', 1, 1, '2019-05-24 10:37:33', '2017-05-01 00:00:00', '2019-05-21 15:49:54', 1, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (25, '1', 1, 1, '2019-05-24 13:26:27', '2017-03-21 00:00:00', '2019-05-23 17:27:32', 1, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (26, '1', 1, 1, '2019-05-24 13:26:20', '2017-04-19 00:00:00', '2019-05-23 17:27:30', 1, 'a', '0', '', '正常运行');
INSERT INTO `ent_task` VALUES (27, '1', 1, 1, '2019-05-24 13:41:51', '2018-05-01 00:00:00', '2019-05-23 17:27:28', 3, 'a', '0', '1', '正常运行');
INSERT INTO `ent_task` VALUES (28, '1', 1, 1, '2019-05-24 13:41:27', '2018-06-01 00:00:00', '2019-05-23 17:27:19', 1, 'a', '0', '王二', '正常运行');
INSERT INTO `ent_task` VALUES (29, '1', 1, 1, '2019-05-24 13:42:10', '2016-10-01 00:00:00', '1978-08-01 08:00:00', 1, 'a', '0', '王二', '正常运行');
INSERT INTO `ent_task` VALUES (30, '1', 4, 1, '2019-05-24 22:49:11', '2019-05-20 02:00:00', '1978-08-01 08:00:00', 1, 'a', '0', '王二', '正常运行');
INSERT INTO `ent_task` VALUES (31, '1', 1, 1, '2019-05-24 13:41:57', '2017-04-01 00:00:00', '1978-08-01 08:00:00', 1, 'a', '0', '王二', '正常运行');
INSERT INTO `ent_task` VALUES (32, '1', 1, 1, '2019-05-24 17:01:35', '2018-09-01 00:00:00', '1978-08-01 08:00:00', 1, 'a', '0', '王二', '正常运行');
INSERT INTO `ent_task` VALUES (33, '1', 3, 3, '2019-05-24 22:12:52', '2019-05-22 00:00:00', '1978-08-01 08:00:00', 1, 'a', '0', '王二', '正常运行');
INSERT INTO `ent_task` VALUES (34, 'bbb', 1, 2, '2019-05-24 15:07:45', '2019-05-24 14:25:43', '2019-05-24 14:25:43', 1, 'a', '0', 'sadasdsd', 'aaa');
INSERT INTO `ent_task` VALUES (35, 'bbb', 1, 2, '2019-05-26 19:55:04', '2019-05-26 19:55:04', '2019-05-26 19:55:04', 1, 'a', '0', 'sadasdsd', 'aaa');
INSERT INTO `ent_task` VALUES (36, 'bbb', 6, 2, '2019-05-27 03:40:11', '2019-05-26 19:55:04', '2019-05-26 19:55:04', 1, 'a', '0', 'sadasdsd', 'aaa');
INSERT INTO `ent_task` VALUES (40, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (41, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (44, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (45, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (46, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (47, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (48, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (49, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (50, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (51, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (52, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (53, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (54, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (55, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (56, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (57, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (58, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (59, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (60, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (61, 'aa', 4, 2, '2019-05-27 16:10:18', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (62, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (63, 'aa', 4, 2, '2019-05-27 16:10:20', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (64, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (65, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (66, 'aa', 6, 2, '2019-05-27 16:10:24', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (67, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (68, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (69, 'aa', 6, 2, '2019-05-27 16:10:27', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (70, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (71, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (72, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (73, 'aa', 6, 2, '2019-05-27 16:10:29', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (74, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (75, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (76, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (77, 'aa', 1, 2, '2019-05-27 16:10:31', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (78, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (79, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (80, 'aa', 2, 2, '2019-05-27 16:10:32', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (81, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (82, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (83, 'aa', 2, 2, '2019-05-27 16:10:34', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (84, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (85, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (86, 'aa', 3, 2, '2019-05-27 16:10:36', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (87, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (88, 'aa', 3, 2, '2019-05-27 16:18:30', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 2, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (89, 'aa', 3, 2, '2019-05-27 16:10:38', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (90, 'aa', 3, 2, '2019-05-27 16:18:27', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 2, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (91, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (92, 'aa', 4, 2, '2019-05-27 16:10:39', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (93, 'aa', 4, 2, '2019-05-27 16:18:26', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 2, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (94, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (95, 'aa', 5, 2, '2019-05-27 16:10:40', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (96, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (97, 'aa', 5, 2, '2019-05-27 16:18:24', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 2, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (98, 'aa', 5, 2, '2019-05-27 16:10:41', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (99, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (100, 'aa', 6, 2, '2019-05-27 16:18:23', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 2, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (101, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (102, 'aa', 6, 2, '2019-05-27 16:10:43', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (103, 'aa', 6, 2, '2019-05-27 16:18:21', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 2, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (104, 'aa', 6, 2, '2019-05-27 16:18:19', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 2, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (105, 'aa', 6, 2, '2019-05-27 16:10:51', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (106, 'aa', 6, 2, '2019-05-27 16:10:45', '2019-05-27 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (107, 'aa', 1, 2, '2019-05-27 16:10:53', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (108, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (109, 'aa', 1, 2, '2019-05-27 16:10:54', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (110, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (111, 'aa', 1, 2, '2019-05-27 16:18:15', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 3, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (112, 'aa', 2, 2, '2019-05-27 16:10:55', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (113, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (114, 'aa', 2, 2, '2019-05-27 16:18:11', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 3, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (115, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (116, 'aa', 2, 2, '2019-05-27 16:10:57', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (117, 'aa', 2, 2, '2019-05-27 16:18:10', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 3, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (118, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (119, 'aa', 3, 2, '2019-05-27 16:18:08', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 3, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (120, 'aa', 3, 2, '2019-05-27 16:10:58', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (121, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (122, 'aa', 3, 2, '2019-05-27 16:18:07', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 3, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (123, 'aa', 4, 2, '2019-05-27 16:10:59', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (124, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (125, 'aa', 4, 2, '2019-05-27 16:18:05', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 3, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (126, 'aa', 4, 2, '2019-05-27 16:11:01', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (127, 'aa', 5, 2, '2019-05-27 16:18:04', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 3, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (128, 'aa', 5, 2, '2019-05-27 16:18:02', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 3, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (129, 'aa', 5, 2, '2019-05-27 16:17:58', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (130, 'aa', 5, 2, '2019-05-27 16:11:02', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (131, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (132, 'aa', 6, 2, '2019-05-27 16:17:56', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (133, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (134, 'aa', 6, 2, '2019-05-27 16:11:03', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (135, 'aa', 6, 2, '2019-05-27 16:17:54', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (136, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (137, 'aa', 6, 2, '2019-05-27 16:11:04', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (138, 'aa', 6, 2, '2019-05-27 16:17:53', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (139, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (140, 'aa', 6, 2, '2019-05-27 16:17:51', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (141, 'aa', 6, 2, '2019-05-27 16:11:06', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (142, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (143, 'aa', 6, 2, '2019-05-27 16:11:17', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (144, 'aa', 6, 2, '2019-05-27 16:11:08', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 20, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (145, 'aa', 6, 2, '2019-05-27 16:11:15', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (146, 'aa', 6, 2, '2019-05-27 16:17:50', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (147, 'aa', 6, 2, '2019-05-27 16:11:18', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (148, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-26 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (149, 'aa', 6, 2, '2019-05-27 16:17:47', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (150, 'aa', 6, 2, '2019-05-27 16:11:19', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (151, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (152, 'aa', 6, 2, '2019-05-27 16:17:45', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (153, 'aa', 6, 2, '2019-05-27 16:11:20', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (154, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (155, 'aa', 6, 2, '2019-05-27 16:17:44', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (156, 'aa', 6, 2, '2019-05-27 16:11:21', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (157, 'aa', 6, 2, '2019-05-27 16:17:43', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (158, 'aa', 5, 2, '2019-05-27 16:17:41', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 4, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (159, 'aa', 5, 2, '2019-05-27 16:11:23', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (160, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (161, 'aa', 5, 2, '2019-05-27 16:17:37', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 5, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (162, 'aa', 5, 2, '2019-05-27 16:11:24', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (163, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (164, 'aa', 5, 2, '2019-05-27 16:17:35', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 5, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (165, 'aa', 5, 2, '2019-05-27 16:11:25', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (166, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (167, 'aa', 5, 2, '2019-05-27 16:17:34', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 5, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (168, 'aa', 4, 2, '2019-05-27 16:11:26', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (169, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (170, 'aa', 4, 2, '2019-05-27 16:17:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 5, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (171, 'aa', 4, 2, '2019-05-27 16:11:27', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (172, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (173, 'aa', 4, 2, '2019-05-27 16:17:31', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 5, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (174, 'aa', 4, 2, '2019-05-27 16:11:29', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (175, 'aa', 4, 2, '2019-05-27 16:17:29', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 5, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (176, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (177, 'aa', 3, 2, '2019-05-27 16:17:28', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 5, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (178, 'aa', 3, 2, '2019-05-27 16:11:30', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (179, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (180, 'aa', 3, 2, '2019-05-27 16:17:26', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 5, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (181, 'aa', 3, 2, '2019-05-27 16:17:23', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 5, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (182, 'aa', 3, 2, '2019-05-27 16:11:31', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (183, 'aa', 3, 2, '2019-05-27 16:17:25', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 5, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (184, 'aa', 3, 2, '2019-05-27 16:17:19', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 6, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (185, 'aa', 2, 2, '2019-05-27 16:11:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 15, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (186, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (187, 'aa', 2, 2, '2019-05-27 16:17:17', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 6, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (188, 'aa', 2, 2, '2019-05-27 16:11:36', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (189, 'aa', 2, 2, '2019-05-27 16:17:15', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 6, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (190, 'aa', 2, 2, '2019-05-27 16:11:40', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (191, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (192, 'aa', 2, 2, '2019-05-27 16:11:41', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (193, 'aa', 2, 2, '2019-05-27 16:17:14', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 6, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (194, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (195, 'aa', 1, 2, '2019-05-27 16:11:43', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (196, 'aa', 1, 2, '2019-05-27 16:17:11', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 6, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (197, 'aa', 1, 2, '2019-05-27 16:17:08', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 6, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (199, 'aa', 1, 2, '2019-05-27 16:11:44', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (374, '1', 5, 1, '2019-05-27 16:22:09', '2019-05-13 00:00:00', '1978-08-01 08:00:00', 1, 'a', '0', '王二', '正常运行');
INSERT INTO `ent_task` VALUES (201, 'aa', 1, 2, '2019-05-27 16:17:10', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 6, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (202, 'aa', 1, 2, '2019-05-27 16:17:03', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (203, 'aa', 1, 2, '2019-05-27 16:11:45', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (204, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (205, 'aa', 1, 2, '2019-05-27 16:17:00', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (206, 'aa', 1, 2, '2019-05-27 16:11:46', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (207, 'aa', 1, 2, '2019-05-27 16:16:59', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (208, 'aa', 1, 2, '2019-05-27 16:16:57', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (209, 'aa', 1, 2, '2019-05-27 16:11:47', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (210, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (211, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (212, 'aa', 1, 2, '2019-05-27 16:16:55', '2019-05-24 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (213, 'aa', 1, 2, '2019-05-27 16:11:48', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (214, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (215, 'aa', 1, 2, '2019-05-27 16:16:53', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (216, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (217, 'aa', 1, 2, '2019-05-27 16:11:50', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (218, 'aa', 1, 2, '2019-05-27 16:16:52', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (219, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (220, 'aa', 1, 2, '2019-05-27 16:11:51', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (221, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (222, 'aa', 2, 2, '2019-05-27 16:16:50', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (223, 'aa', 2, 2, '2019-05-27 16:16:48', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (224, 'aa', 2, 2, '2019-05-27 16:11:52', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 21, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (225, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (226, 'aa', 2, 2, '2019-05-27 16:11:56', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 18, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (227, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (228, 'aa', 2, 2, '2019-05-27 16:16:47', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (229, 'aa', 2, 2, '2019-05-27 16:12:01', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 18, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (230, 'aa', 2, 2, '2019-05-27 16:16:45', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (231, 'aa', 2, 2, '2019-05-27 16:12:02', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 18, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (232, 'aa', 3, 2, '2019-05-27 16:16:43', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 7, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (233, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (234, 'aa', 3, 2, '2019-05-27 16:16:08', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 8, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (235, 'aa', 3, 2, '2019-05-27 16:12:03', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 18, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (236, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (237, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (238, 'aa', 3, 2, '2019-05-27 16:16:03', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 8, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (239, 'aa', 3, 2, '2019-05-27 16:12:04', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 18, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (240, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (241, 'aa', 3, 2, '2019-05-27 16:16:01', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 8, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (242, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (243, 'aa', 4, 2, '2019-05-27 16:12:05', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 18, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (244, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (245, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (246, 'aa', 4, 2, '2019-05-27 16:15:59', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 8, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (247, 'aa', 4, 2, '2019-05-27 16:12:07', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 18, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (248, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (249, 'aa', 5, 2, '2019-05-27 16:15:58', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 8, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (250, 'aa', 5, 2, '2019-05-27 16:15:56', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 8, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (251, 'aa', 5, 2, '2019-05-27 16:12:08', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 18, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (252, 'aa', 5, 2, '2019-05-27 16:12:13', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (253, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (254, 'aa', 5, 2, '2019-05-27 16:12:17', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (255, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (256, 'aa', 5, 2, '2019-05-27 16:12:19', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (257, 'aa', 6, 2, '2019-05-27 16:15:53', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 8, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (258, 'aa', 6, 2, '2019-05-27 16:15:51', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 8, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (259, 'aa', 6, 2, '2019-05-27 16:12:20', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (260, 'aa', 6, 2, '2019-05-27 16:15:44', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 9, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (261, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (262, 'aa', 6, 2, '2019-05-27 16:12:21', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (263, 'aa', 6, 2, '2019-05-27 16:15:42', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 9, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (264, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-25 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (265, 'aa', 6, 2, '2019-05-27 16:12:22', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (266, 'aa', 6, 2, '2019-05-27 16:15:40', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 9, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (267, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (268, 'aa', 5, 2, '2019-05-27 16:12:23', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (269, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (270, 'aa', 5, 2, '2019-05-27 16:15:39', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 9, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (271, 'aa', 4, 2, '2019-05-27 16:12:25', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (272, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (273, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (274, 'aa', 4, 2, '2019-05-27 16:15:37', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 9, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (275, 'aa', 3, 2, '2019-05-27 16:12:26', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (276, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (277, 'aa', 2, 2, '2019-05-27 16:15:36', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 9, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (278, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (279, 'aa', 2, 2, '2019-05-27 16:12:27', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (280, 'aa', 2, 2, '2019-05-27 16:15:34', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 9, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (281, 'aa', 1, 2, '2019-05-27 16:15:32', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 9, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (282, 'aa', 1, 2, '2019-05-27 16:12:28', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (283, 'aa', 1, 2, '2019-05-27 16:15:27', '2019-05-21 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (284, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (285, 'aa', 2, 2, '2019-05-27 16:12:30', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 17, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (286, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (287, 'aa', 2, 2, '2019-05-27 16:15:25', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (288, 'aa', 2, 2, '2019-05-27 16:12:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 16, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (289, 'aa', 2, 2, '2019-05-27 16:15:23', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (290, 'aa', 2, 2, '2019-05-27 16:12:38', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 16, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (291, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (292, 'aa', 3, 2, '2019-05-27 16:12:39', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 16, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (293, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (294, 'aa', 3, 2, '2019-05-27 16:15:22', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (295, 'aa', 3, 2, '2019-05-27 16:12:40', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 16, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (296, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (297, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (298, 'aa', 4, 2, '2019-05-27 16:15:20', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (299, 'aa', 4, 2, '2019-05-27 16:12:42', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 16, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (300, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (301, 'aa', 4, 2, '2019-05-27 16:15:18', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (302, 'aa', 4, 2, '2019-05-27 16:12:43', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 16, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (303, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (304, 'aa', 5, 2, '2019-05-27 16:15:17', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (305, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (306, 'aa', 5, 2, '2019-05-27 16:12:44', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 16, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (307, 'aa', 5, 2, '2019-05-27 16:15:15', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (308, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (309, 'aa', 5, 2, '2019-05-27 16:15:12', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 10, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (310, 'aa', 6, 2, '2019-05-27 16:12:45', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 16, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (311, 'aa', 6, 2, '2019-05-27 16:15:07', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 11, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (312, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (313, 'aa', 6, 2, '2019-05-27 16:12:49', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 16, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (314, 'aa', 6, 2, '2019-05-27 16:15:04', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 11, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (315, 'aa', 6, 2, '2019-05-27 16:12:54', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (316, 'aa', 6, 2, '2019-05-27 16:15:02', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 11, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (317, 'aa', 6, 2, '2019-05-27 16:12:55', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (318, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (319, 'aa', 6, 2, '2019-05-27 16:12:56', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (320, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (321, 'aa', 6, 2, '2019-05-27 16:15:00', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 11, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (322, 'aa', 6, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (323, 'aa', 6, 2, '2019-05-27 16:12:58', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (324, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (325, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (326, 'aa', 5, 2, '2019-05-27 16:12:59', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (327, 'aa', 5, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (328, 'aa', 5, 2, '2019-05-27 16:14:58', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 11, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (329, 'aa', 5, 2, '2019-05-27 16:13:00', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (330, 'aa', 5, 2, '2019-05-27 16:14:56', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 11, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (331, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (332, 'aa', 4, 2, '2019-05-27 16:13:01', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (333, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (334, 'aa', 4, 2, '2019-05-27 16:14:54', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 11, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (335, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (336, 'aa', 4, 2, '2019-05-27 16:13:02', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (337, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (338, 'aa', 4, 2, '2019-05-27 16:14:52', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 11, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (339, 'aa', 4, 2, '2019-05-27 16:13:03', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (340, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (341, 'aa', 4, 2, '2019-05-27 16:14:43', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 12, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (342, 'aa', 4, 2, '2019-05-27 16:13:05', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (343, 'aa', 4, 2, '2019-05-27 16:14:48', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 11, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (344, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (345, 'aa', 4, 2, '2019-05-27 16:14:41', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 12, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (346, 'aa', 4, 2, '2019-05-27 16:13:06', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (347, 'aa', 4, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (348, 'aa', 4, 2, '2019-05-27 16:14:39', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 12, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (349, 'aa', 4, 2, '2019-05-27 16:13:07', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (350, 'aa', 4, 2, '2019-05-27 16:14:37', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 12, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (351, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (352, 'aa', 3, 2, '2019-05-27 16:13:08', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (353, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (354, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (355, 'aa', 3, 2, '2019-05-27 16:13:10', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 14, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (356, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (357, 'aa', 3, 2, '2019-05-27 16:14:35', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 12, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (358, 'aa', 3, 2, '2019-05-27 16:13:14', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 13, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (359, 'aa', 3, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (360, 'aa', 3, 2, '2019-05-27 16:13:16', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 13, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (361, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (362, 'aa', 2, 2, '2019-05-27 16:13:18', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 13, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (363, 'aa', 2, 2, '2019-05-27 16:14:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 12, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (364, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (365, 'aa', 1, 2, '2019-05-27 16:13:19', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 13, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (366, 'aa', 1, 2, '2019-05-27 16:14:30', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 12, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (367, 'aa', 4, 3, '2019-05-27 16:22:42', '2019-05-21 00:00:00', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (368, 'aa', 1, 2, '2019-05-27 16:13:20', '2019-05-23 10:37:33', '2019-05-27 10:37:33', 13, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (369, 'aa', 1, 2, '2019-05-27 16:14:27', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 12, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (370, 'aa', 1, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (371, 'aa', 1, 2, '2019-05-27 16:13:21', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 13, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (372, 'aa', 2, 2, '2019-05-24 10:37:33', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 1, 'a', '0', 'asd', 'aaa');
INSERT INTO `ent_task` VALUES (373, 'aa', 2, 2, '2019-05-27 16:13:25', '2019-05-22 10:37:33', '2019-05-27 10:37:33', 13, 'a', '0', 'asd', 'aaa');
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
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rel_device_trouble
-- ----------------------------
BEGIN;
INSERT INTO `rel_device_trouble` VALUES (1, '2019-05-24 13:51:53', 1, 5, '电机故障', '电机损坏', '1');
INSERT INTO `rel_device_trouble` VALUES (2, '2016-05-21 07:57:55', 2, 6, '机械故障', '机械损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (3, '2016-05-25 07:58:47', 3, 7, '电源故障', '电源损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (4, '2019-05-22 10:22:42', 4, 8, '电源故障', '电源损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (5, '2019-05-22 10:22:41', 5, 9, '底座故障', '底座损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (6, '2019-05-22 10:22:41', 6, 10, '电源故障', '电源损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (7, '2019-05-22 10:22:42', 7, 11, '机械故障', '机械损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (8, '2019-05-22 10:22:41', 8, 12, '电源故障', '电源损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (9, '2019-05-22 10:22:42', 9, 13, '电机故障', '电机损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (10, '2019-05-22 10:22:41', 10, 14, '电源故障', '电源损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (11, '2019-05-22 10:22:42', 11, 15, '电机故障', '电机损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (12, '2019-05-22 10:22:42', 12, 16, '电源故障', '电源损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (13, '2019-05-24 10:43:07', 15, 18, '底座故障', '底座损坏', '0');
INSERT INTO `rel_device_trouble` VALUES (14, '2019-05-24 11:41:51', 16, NULL, '电机故障', NULL, '0');
COMMIT;

-- ----------------------------
-- Table structure for sys_admin_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_admin_user`;
CREATE TABLE `sys_admin_user` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT,
  `user_no` varchar(50) NOT NULL,
  `user_pwd` varchar(100) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_no` (`user_no`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_admin_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_admin_user` VALUES (1, 'admin', '123456', '张三');
INSERT INTO `sys_admin_user` VALUES (2, 'admin1', '123456', '李四');
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
  `is_delete` int(1) NOT NULL DEFAULT '0' COMMENT '0为未删除，1为删除',
  `province` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1120 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_uav_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_uav_user` VALUES (3, '不会', '2019-05-16', '管理员', '女', '基础上比较', '456783456', 1, '福建省');
INSERT INTO `sys_uav_user` VALUES (4, 'v造成不便', '2019-05-16', '管理员', '女', '基础上比较', '456783456', 1, '四川省');
INSERT INTO `sys_uav_user` VALUES (5, 'v造成不便', '2019-05-16', '管理员', '女', '基础上比较', '456783456', 1, '福建省');
INSERT INTO `sys_uav_user` VALUES (6, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678', 1, '广东省');
INSERT INTO `sys_uav_user` VALUES (7, '77777777', '2018-08-02', '普通用户', '男', '常见的', '12345678', 1, '福建省');
INSERT INTO `sys_uav_user` VALUES (8, '哈哈哈', '2018-08-02', '管理员', '男', '常见的', '12345678', 1, '广东省');
INSERT INTO `sys_uav_user` VALUES (9, '哈哈哈', '2018-08-02', '普通用户', '女', '常见的', '12345678', 0, '广东省');
INSERT INTO `sys_uav_user` VALUES (10, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678', 1, '广东省');
INSERT INTO `sys_uav_user` VALUES (11, '哈哈哈', '2018-07-02', '普通用户', '男', '常见的', '12345678', 0, '广东省');
INSERT INTO `sys_uav_user` VALUES (12, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678', 0, '福建省');
INSERT INTO `sys_uav_user` VALUES (13, '哈哈哈', '2018-06-02', '普通用户', '男', '常见的', '12345678', 0, '广东省');
INSERT INTO `sys_uav_user` VALUES (14, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678', 0, '广东省');
INSERT INTO `sys_uav_user` VALUES (15, '77777777', '2018-12-03', '普通用户', '男', '常见的', '12345678', 1, '四川省');
INSERT INTO `sys_uav_user` VALUES (16, '哈哈哈', '2018-04-02', '普通用户', '男', '常见的', '12345678', 0, '福建省');
INSERT INTO `sys_uav_user` VALUES (17, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678', 0, '四川省');
INSERT INTO `sys_uav_user` VALUES (18, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678', 0, '四川省');
INSERT INTO `sys_uav_user` VALUES (19, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678', 1, '福建省');
INSERT INTO `sys_uav_user` VALUES (20, '哈哈哈', '2019-02-02', '普通用户', '男', '常见的', '12345678', 0, '四川省');
INSERT INTO `sys_uav_user` VALUES (1025, 'EEEEE', '2019-05-07', '普通用户', '男', '', '444', 0, '广东省');
INSERT INTO `sys_uav_user` VALUES (1109, '444', '2019-06-01', '普通用户', '女', '', '44', 0, '四川省');
INSERT INTO `sys_uav_user` VALUES (1092, '55', '2019-05-01', '普通用户', '女', '', '33', 1, '青海省');
INSERT INTO `sys_uav_user` VALUES (1065, '特瑞特让他', '2018-12-01', '普通用户', '女', '41354154264', '1213243', 0, '青海省');
INSERT INTO `sys_uav_user` VALUES (1029, '4', '2018-10-01', '', '女', '', '', 1, '四川省');
INSERT INTO `sys_uav_user` VALUES (1024, '饭店宾馆吧', '2019-05-02', '普通用户', '男', '12345', '123456', 0, '青海省');
INSERT INTO `sys_uav_user` VALUES (1110, 'none', '2018-09-27', '普通用户', '', '无', '10010', 1, '青海省');
INSERT INTO `sys_uav_user` VALUES (1111, '哈哈哈', '2018-02-02', '普通用户', '男', '常见的', '12345678', 0, '福建省');
INSERT INTO `sys_uav_user` VALUES (1112, '特瑞特让他', '2019-03-01', '普通用户', '女', '41354154264', '1213243', 0, '福建省');
INSERT INTO `sys_uav_user` VALUES (1113, '55', '2019-04-01', '普通用户', '女', '', '33', 1, '青海省');
INSERT INTO `sys_uav_user` VALUES (1114, '哈哈哈', '2018-01-02', '普通用户', '男', '常见的', '12345678', 0, '四川省');
INSERT INTO `sys_uav_user` VALUES (1115, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678', 0, '四川省');
INSERT INTO `sys_uav_user` VALUES (1116, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678', 0, '福建省');
INSERT INTO `sys_uav_user` VALUES (1117, '77777777', '2018-10-03', '普通用户', '男', '常见的', '12345678', 1, '四川省');
INSERT INTO `sys_uav_user` VALUES (1118, '哈哈哈', '2018-08-02', '普通用户', '男', '常见的', '12345678', 0, '福建省');
INSERT INTO `sys_uav_user` VALUES (1119, '77777777', '2018-12-03', '普通用户', '男', '常见的', '12345678', 1, '四川省');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
