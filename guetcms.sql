/*
 Navicat Premium Data Transfer

 Source Server         : guetcms
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : guetcms

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 01/02/2023 13:54:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `NEW_ID` int NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `CONTENT` varchar(10000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `URL` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`NEW_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (2, '标题2', '<p>内容2</p>', NULL);
INSERT INTO `news` VALUES (3, '标题3', '<p>内容5</p>', NULL);

-- ----------------------------
-- Table structure for news_type
-- ----------------------------
DROP TABLE IF EXISTS `news_type`;
CREATE TABLE `news_type`  (
  `NEW_ID` int NULL DEFAULT NULL,
  `TYPE_ID` int NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news_type
-- ----------------------------
INSERT INTO `news_type` VALUES (2, 2);
INSERT INTO `news_type` VALUES (3, 1);

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `PER_ID` int NOT NULL,
  `NAME` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `URL` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `TARGET` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ICON` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ISPARENT` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `PARENT_ID` int NULL DEFAULT NULL,
  PRIMARY KEY (`PER_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (100, '首页', 'home', 'content', 'fa fa-home', 'yes', NULL);
INSERT INTO `permission` VALUES (101, '用户管理', NULL, NULL, 'fa fa-user', 'yes', NULL);
INSERT INTO `permission` VALUES (201, '角色管理', NULL, NULL, 'fa fa-user-o', 'yes', NULL);
INSERT INTO `permission` VALUES (301, '权限管理', NULL, NULL, 'iconfont icon-setting-permission', 'yes', NULL);
INSERT INTO `permission` VALUES (401, '文章管理', NULL, NULL, 'iconfont icon-guanliwenzhang', 'yes', NULL);
INSERT INTO `permission` VALUES (501, '轮播图管理', NULL, NULL, 'fa fa-user-o', 'yes', NULL);
INSERT INTO `permission` VALUES (601, '附件管理', NULL, NULL, 'fa fa-file-zip-o', 'yes', NULL);
INSERT INTO `permission` VALUES (1011, '用户列表', '/user/userList', 'content', 'iconfont icon-yonghu1', 'no', 101);
INSERT INTO `permission` VALUES (2011, '角色列表', '/role/roleList', 'content', 'iconfont icon-jiaoseguanli', 'no', 201);
INSERT INTO `permission` VALUES (3011, '权限列表', 'perList.html', 'content', 'iconfont icon-quanxianguanli', 'no', 301);
INSERT INTO `permission` VALUES (4011, '文章列表', 'articleList.html', 'content', 'iconfont icon-wenzhangliebiaoxiangqing', 'no', 401);
INSERT INTO `permission` VALUES (4012, '文章发布', 'article.html', 'content', 'iconfont icon-wenzhangfenlei', 'no', 401);
INSERT INTO `permission` VALUES (5011, '轮播图列表', 'loopImgList.html', 'content', 'iconfont icon-lunbotu', 'no', 501);
INSERT INTO `permission` VALUES (6011, '附件列表', 'attachmentList.html', 'content', 'iconfont icon-yonghu1', 'no', 601);

-- ----------------------------
-- Table structure for permissions
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions`  (
  `PER_ID` int NOT NULL,
  `NAME` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `URL` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `TARGET` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ICON` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ISPARENT` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `PARENT_ID` int NULL DEFAULT NULL,
  PRIMARY KEY (`PER_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of permissions
-- ----------------------------
INSERT INTO `permissions` VALUES (100, '首页', 'main.html', 'content', 'iconfont icon-home2', 'yes', NULL);
INSERT INTO `permissions` VALUES (101, '用户管理', NULL, NULL, 'iconfont icon-yonghu', 'yes', NULL);
INSERT INTO `permissions` VALUES (201, '角色管理', NULL, NULL, 'iconfont icon-jiaoseguanli1', 'yes', NULL);
INSERT INTO `permissions` VALUES (301, '权限管理', NULL, NULL, 'iconfont icon-setting-permissions', 'yes', NULL);
INSERT INTO `permissions` VALUES (401, '文章管理', NULL, NULL, 'iconfont icon-guanliwenzhang', 'yes', NULL);
INSERT INTO `permissions` VALUES (501, '轮播图管理', NULL, NULL, 'iconfont icon-shouyelunbotu', 'yes', NULL);
INSERT INTO `permissions` VALUES (601, '附件管理', NULL, NULL, 'iconfont icon-yonghu1', 'yes', NULL);
INSERT INTO `permissions` VALUES (1011, '用户列表', 'userList.html', 'content', 'iconfont icon-yonghu1', 'no', 101);
INSERT INTO `permissions` VALUES (2011, '角色列表', 'roleList.html', 'content', 'iconfont icon-jiaoseguanli', 'no', 201);
INSERT INTO `permissions` VALUES (3011, '权限列表', 'perList.html', 'content', 'iconfont icon-quanxianguanli', 'no', 301);
INSERT INTO `permissions` VALUES (4011, '文章列表', 'articleList.html', 'content', 'iconfont icon-wenzhangliebiaoxiangqing', 'no', 401);
INSERT INTO `permissions` VALUES (4012, '文章发布', 'article.html', 'content', 'iconfont icon-wenzhangfenlei', 'no', 401);
INSERT INTO `permissions` VALUES (5011, '轮播图列表', 'loopImgList.html', 'content', 'iconfont icon-lunbotu', 'no', 501);
INSERT INTO `permissions` VALUES (6011, '附件列表', 'attachmentList.html', 'content', 'iconfont icon-yonghu1', 'no', 601);

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `ROLE_ID` int NOT NULL,
  `PER_ID` int NOT NULL,
  PRIMARY KEY (`ROLE_ID`, `PER_ID`) USING BTREE,
  INDEX `ROLE_PERMISSION_PFK`(`PER_ID` ASC) USING BTREE,
  CONSTRAINT `ROLE_PERMISSION_PFK` FOREIGN KEY (`PER_ID`) REFERENCES `permissions` (`PER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `ROLE_PERMISSION_RFK` FOREIGN KEY (`ROLE_ID`) REFERENCES `roles` (`ROLE_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES (10, 100);
INSERT INTO `role_permission` VALUES (11, 100);
INSERT INTO `role_permission` VALUES (12, 100);
INSERT INTO `role_permission` VALUES (13, 100);
INSERT INTO `role_permission` VALUES (22, 100);
INSERT INTO `role_permission` VALUES (10, 101);
INSERT INTO `role_permission` VALUES (13, 101);
INSERT INTO `role_permission` VALUES (22, 101);
INSERT INTO `role_permission` VALUES (10, 201);
INSERT INTO `role_permission` VALUES (13, 201);
INSERT INTO `role_permission` VALUES (22, 201);
INSERT INTO `role_permission` VALUES (10, 301);
INSERT INTO `role_permission` VALUES (10, 401);
INSERT INTO `role_permission` VALUES (11, 401);
INSERT INTO `role_permission` VALUES (10, 501);
INSERT INTO `role_permission` VALUES (11, 501);
INSERT INTO `role_permission` VALUES (12, 501);
INSERT INTO `role_permission` VALUES (10, 601);
INSERT INTO `role_permission` VALUES (11, 601);
INSERT INTO `role_permission` VALUES (10, 1011);
INSERT INTO `role_permission` VALUES (10, 2011);
INSERT INTO `role_permission` VALUES (10, 3011);
INSERT INTO `role_permission` VALUES (10, 4011);
INSERT INTO `role_permission` VALUES (11, 4011);
INSERT INTO `role_permission` VALUES (10, 4012);
INSERT INTO `role_permission` VALUES (11, 4012);
INSERT INTO `role_permission` VALUES (10, 5011);
INSERT INTO `role_permission` VALUES (11, 5011);
INSERT INTO `role_permission` VALUES (12, 5011);
INSERT INTO `role_permission` VALUES (10, 6011);
INSERT INTO `role_permission` VALUES (11, 6011);

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles`  (
  `ROLE_ID` int NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ROLE_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES (10, '超级管理员');
INSERT INTO `roles` VALUES (11, '普通管理员');
INSERT INTO `roles` VALUES (12, '轮播图管理员');
INSERT INTO `roles` VALUES (13, '测试管理员');
INSERT INTO `roles` VALUES (22, 'test');

-- ----------------------------
-- Table structure for types
-- ----------------------------
DROP TABLE IF EXISTS `types`;
CREATE TABLE `types`  (
  `TYPE_ID` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`TYPE_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of types
-- ----------------------------
INSERT INTO `types` VALUES (1, '桂电新闻');
INSERT INTO `types` VALUES (2, '校园快讯');
INSERT INTO `types` VALUES (3, '学院动态');
INSERT INTO `types` VALUES (4, '媒体桂电');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `USER_ID` int NOT NULL,
  `ROLE_ID` int NOT NULL,
  PRIMARY KEY (`ROLE_ID`, `USER_ID`) USING BTREE,
  INDEX `USER_ROLE_UFK`(`USER_ID` ASC) USING BTREE,
  CONSTRAINT `USER_ROLE_RFK` FOREIGN KEY (`ROLE_ID`) REFERENCES `roles` (`ROLE_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `USER_ROLE_UFK` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`USER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (19001, 10);
INSERT INTO `user_role` VALUES (19002, 11);
INSERT INTO `user_role` VALUES (19003, 11);
INSERT INTO `user_role` VALUES (19004, 11);
INSERT INTO `user_role` VALUES (19023, 13);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `USER_ID` int NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `PASSWORD` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19024 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (19001, 'admin', '1234');
INSERT INTO `users` VALUES (19002, 'normal', '123456');
INSERT INTO `users` VALUES (19003, 'lisi', 'abcd');
INSERT INTO `users` VALUES (19004, 'zhangsan', '123456');
INSERT INTO `users` VALUES (19023, 'test', '123456');

SET FOREIGN_KEY_CHECKS = 1;
