
CREATE DATABASE IF NOT EXISTS `zy_tea`;

use zy_tea;

DROP TABLE IF EXISTS `vote_tea`;
CREATE TABLE `vote_tea` (
  `id` int(10) unsigned NOT NULL COMMENT '主键',
  `name` varchar(10) NOT NULL COMMENT '茶叶品类',
  `poll` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '投票数',
  `image_url` varchar(30) NOT NULL COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `vote_tea` VALUES ('1', '安化黑茶', '0', 'ahhc.gif');
INSERT INTO `vote_tea` VALUES ('2', '安吉白茶', '0', 'ajbc.gif');
INSERT INTO `vote_tea` VALUES ('3', '安溪铁观音', '0', 'axtgy.gif');
INSERT INTO `vote_tea` VALUES ('4', '黄山毛峰', '0', 'hsmf.gif');
INSERT INTO `vote_tea` VALUES ('5', '君山银针', '0', 'jsyz.gif');
INSERT INTO `vote_tea` VALUES ('6', '六安瓜片', '0', 'lagp.gif');
INSERT INTO `vote_tea` VALUES ('7', '庐山云雾茶', '0', 'lsywc.gif');
INSERT INTO `vote_tea` VALUES ('8', '茉莉花茶', '0', 'mlhc.gif');
INSERT INTO `vote_tea` VALUES ('9', '湄潭翠芽', '0', 'mtcy.gif');
INSERT INTO `vote_tea` VALUES ('10', '普洱茶', '0', 'pec.gif');
INSERT INTO `vote_tea` VALUES ('11', '武夷山大红袍', '0', 'wysdhp.gif');
INSERT INTO `vote_tea` VALUES ('12', '信阳毛尖', '0', 'xymj.gif');

DROP TABLE IF EXISTS `tea`;
CREATE TABLE `tea` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `shape` float(3,2) unsigned NOT NULL COMMENT '形状',
  `color` float(3,2) unsigned NOT NULL COMMENT '色泽',
  `neatness` float(3,2) unsigned NOT NULL COMMENT '净度',
  `soupColor` float(3,2) unsigned NOT NULL COMMENT '汤色',
  `fragrance` float(3,2) unsigned NOT NULL COMMENT '香气',
  `taste` float(3,2) unsigned NOT NULL COMMENT '滋味',
  `leaf` float(3,2) unsigned NOT NULL COMMENT '叶底',
  `grade` tinyint(3) unsigned NOT NULL COMMENT '品级 0特一级 1特二级 2特三级 3一级  4二级 5三级 6四级',
  `add_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

INSERT INTO `tea` VALUES (1,'1', '0.90', '0.90', '0.90', '1', '1', '0.90', '0',null);
INSERT INTO `tea` VALUES (2,'0.90', '0.80', '0.90', '0.90', '0.90', '0.90', '0.80', '1',null);
INSERT INTO `tea` VALUES (3,'0.80', '0.70', '0.90', '0.80', '0.80', '0.70', '0.70', '2',null);
INSERT INTO `tea` VALUES (4,'0.60', '0.50', '0.70', '0.60', '0.70', '0.70', '0.60', '3',null);
INSERT INTO `tea` VALUES (5,'0.50', '0.40', '0.50', '0.50', '0.60', '0.60', '0.40', '4',null);
INSERT INTO `tea` VALUES (6,'0.40', '0.30', '0.50', '0.40', '0.50', '0.50', '0.40', '5',null);
INSERT INTO `tea` VALUES (7,'0.30', '0.20', '0.50', '0.20', '0.30', '0.30', '0.20', '6',null);
