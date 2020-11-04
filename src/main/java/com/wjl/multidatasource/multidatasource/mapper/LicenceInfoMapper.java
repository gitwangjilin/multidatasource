package com.wjl.multidatasource.multidatasource.mapper;

import com.wjl.multidatasource.multidatasource.entity.LicenceInfo;
import org.springframework.stereotype.Repository;p import java.util.List;

@Mapper
@Repository
public interface LicenceInfoMapper {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param licenceInfo 实例对象
     * @return 对象列表
     */

    List<LicenceInfo> getList(LicenceInfo licenceInfo);

    /**
     * 通过ID查询单条数据
     *
     * @param businessSerial 主键
     * @return 实例对象
     */
    LicenceInfo getById(String businessSerial);


    /**
     * 新增数据
     *
     * @param licenceInfo 实例对象
     * @return 影响行数
     */
    int insert(LicenceInfo licenceInfo);

    /**
     * 修改数据
     *
     * @param licenceInfo 实例对象
     * @return 影响行数
     */
    int update(LicenceInfo licenceInfo);

    /**
     * 通过主键删除数据
     *
     * @param businessSerial 主键
     * @return 影响行数
     */
    int deleteById(String businessSerial);

    /**
     * 根据appLicenceNum查询信息
     *
     * @param licenceInfo
     * @return
     */
    LicenceInfo selectByAppLicenceNum(LicenceInfo licenceInfo);

    /**
     * 通过执照序列号删除数据
     *
     * @param licenceSn
     * @return
     */
    int deleteByLicenceSn(String licenceSn);

    /**
     * 根据sn获取一条数据
     *
     * @param licenceSn
     * @return
     */
    LicenceInfo getLicenceInfo(String licenceSn);

    /***
     * 根据法人收取按Id获取法人sn
     * @param superAuthId
     * @return
     */
    List<LicenceInfo> getSuperSn(String superAuthId);

    /**
     * 查询企业法人执照数据
     *
     * @param orgCode
     * @return
     */
    List<LicenceInfo> getLicInfo(String orgCode);

    /***
     * 查询法人信息
     * @param info
     * @return
     */
    List<LicenceInfo> getLicInfoByOrgCode(LicenceInfo info);

    /***
     * 根据授权id查询持照人证件号
     * @param authId
     * @param appId
     * @return
     */
    LicenceInfo getLicenceInfoByAuthId(String authId, String appId);

    /**
     * 根据统一社会信用代码和地区编码查询执照表
     *
     * @param info
     * @return
     */
    List<LicenceInfo> getLicListByOrgCode(LicenceInfo info);

    /**
     * 已有licAuthId，根据licAuthId和areaCode获取持照人姓名 仅对管理员角色有效
     *
     * @param authId   管理员授权Id
     * @param areaCode 地区编码
     * @return 持照人姓名
     */
    List<LicenceInfo>  getHolderName(String authId, String areaCode);

}
