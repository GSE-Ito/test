//
//FileName : SAA540PrintBean.java
//Created  : Tatsuki Tomohisa (MELCO)
//Date     : 2005-09-01
//COPYRIGHT (C) 2005 MITSUBISHI ELECTRIC CORPORATION
//ALL RIGHTS RESERVED
//
package jp.co.kyuden.sizai.it.saa.saa510.logic.inputinfo;

import java.util.ArrayList;
import java.util.HashMap;

import jp.co.kyuden.sizai.it.saa.saa510.SAA510Define;
import jp.co.kyuden.sizai.it.saa.saa510.util.SAA510Util;
import jp.co.kyuden.sizai.it.sac.sac000.logic.PrintLogic;
import jp.co.melco.garnet.base.foundation.Logger;
import jp.co.melco.kyuden.sizai.it.common.framework.Datatable;
import jp.co.melco.kyuden.sizai.it.util.BeanBase;

/**
 * ���ψ˗����o�͕ێ����Bean.<br>
 * ���ψ˗����o�͂ɑ΂�����͏��Bean.<BR>
 * �H���E�^���E�ϑ����ψ˗����o�͂Ɋւ������ێ�����
 *
 * @author        Tatsuki Tomohisa (MELCO)
 * @version       1.00    2006-04-28 <br>
 *                2.00 Tatsuki Tomohisa (MELCO) 2006-09-10 �Ɩ�APP�\�����P<br>
 *                       �E[��Q�ԍ�U-2057(�Ɩ�APP�\�����P-�t�@�C���w�b�_�R�����g�̋L�ړO��)]�Ή�<br>
 *                       �E[��Q�ԍ�U-2056(�Ɩ�APP�\�����P-�ύX�����̋L�ړO��)]�Ή�<br>
 *                       �E[��Q�ԍ�U-1987(�Ɩ�APP�\�����P-JavaDoc�CJSDoc�x���C��)]�Ή�<br>
 *                2.01 Katou Ryo (MELCO) 2006-09-24 �Ɩ�APP�\�����P<br>
 *                       �E[��Q�ԍ�U-2135(�Ɩ�APP�\�����P-JavaDoc�CJSDoc�ŐV��)]�Ή�<br>
 *                3.00 Tatsuki Tomohisa (MELCO) 2007-06-17 �d�l�ύX<br>
 *                       �E[��Q�ԍ�U20070021]�Ή�<br>
 *                3.01 Tatsuki Tomohisa (MELCO) 2007-07-01 �d�l�ύX<br>
 *                       �E[��Q�ԍ�U20070348]�Ή�<br>
 *                3.02 Sakamoto Shigefumi (MELCO) 2008-01-17 ��Q���C<br>
 *                       �E[��Q�ԍ�U-1966(���݃��T�C�N���@�ΏۍH���̌��ψ˗����ɂ���)]�Ή�<br>
 *                4.00 Hikaru Yamada (MELCO) 2008-07-27 ��Q���C<br>
 *                       �E[��Q�ԍ�U20080311]�Ή�<br>
 *                4.01 Matsuo Jouji (MELCO) 2009-03-20 �d�l�ύX<br>
 *                       �E[��Q�ԍ�U20080857(�Ɩ��ڊ�No14�u�Ɩ������ւ���g�D�����ւ̑Ή��@�\�ǉ��i�������̉��P�j�v)]�Ή�<br>
 *                5.00 Miyamoto Koki (MELCO) 2009-11-29 �d�l�ύX<br>
 *                       �E[��Q�ԍ�U20090226]�Ή�<br>
 *               10.00 Hikaru Yamada (QBS) 2014-05-25 �d�l�ύX<br>
 *                       �E[��Q�ԍ�U20140036]�Ή�<br>
 *               10.01 Tomohisa Tatsuki (QBS) 2015-03-08 �d�l�ύX<br>
 *                       �E[��Q�ԍ�U20140294]�Ή�<br>
 *               12.00 Tomohisa Tatsuki (QBS) 2017-11-26 �d�l�ύX<br>
 *                       �E[��Q�ԍ�U20170253]�Ή�<br> 
 */
public class SAA540PrintBean extends BeanBase {

    /*
     * Logger�N���X
     */
    private static Logger logger = Logger.getLogger(SAA510Util.class);
    /** ���s�R�[�h */
    private final String CRLF_CODE = "\r\n";
    
    /** �˗����w�b�_ **/
    private ArrayList iraisho = new ArrayList();

    /** �˗���(�H��) **/
    private ArrayList kojiIraisho = new ArrayList();
    
    /** �˗���(�^��) **/
    private ArrayList unsoIraisho = new ArrayList();
    
    /** �˗���(�ϑ�) **/
    private ArrayList itakuIraisho = new ArrayList();

    /** �˗������� **/
    private HashMap iraishoMeisai = new HashMap();

    /** ���ӕ��� **/
    private HashMap chuiBunsho = new HashMap();

    /** ���l **/
    private HashMap hBiko = new HashMap();

    /** �Ɩ��敪 **/
    private String gyomuKubun = "";

    /** ������W���ꏊ **/
    private HashMap hSetsumeiKaiBasho = new HashMap();

   /** �^����ԁi���j **/
    private HashMap hUnsoKukanTo = new HashMap();

    private final int ARRAY_INDEX_0 = 0;
    private final int ARRAY_INDEX_1 = 1;
    private final int ARRAY_INDEX_2 = 2;
    private final int ARRAY_INDEX_3 = 3;
    private final int ARRAY_INDEX_4 = 4;
    private final int ARRAY_INDEX_5 = 5;
    private final int ARRAY_INDEX_6 = 6;
    private final int ARRAY_INDEX_7 = 7;
    private final int ARRAY_INDEX_8 = 8;
    private final int ARRAY_INDEX_9 = 9;
    private final int ARRAY_INDEX_10 = 10;
    private final int ARRAY_INDEX_11 = 11;
    private final int ARRAY_INDEX_12 = 12;
    private final int ARRAY_INDEX_13 = 13;
    private final int ARRAY_INDEX_14 = 14;
    private final int ARRAY_INDEX_15 = 15;
  
    /**
     * @param list ArrayList�˗����w�b�_�E���ו� 
     */
    public void setIraisho(ArrayList list) {
        iraisho = list;
    }

    /**
     * @return ArrayList[] �˗����w�b�_�E���ו� 
     */
    public ArrayList getIraisho() {
        return this.iraisho;
    }


  /**
   * ���
   * @param data �f�[�^�e�[�u��
   * @throws Exception �G���[
   */
  public void print(Datatable data) throws Exception {
      
      //���[ID���擾����
      String idPrintId = (String)data.get(SAA510Define.ID_PRINT_ID);
      
      // ���[ID�̎擾�@�ύX2
      PrintLogic pl = new PrintLogic(idPrintId);

      ArrayList meisaiList = getIraisho(); 
      
      for (int i = 0; i < meisaiList.size(); i++) {

          SAA540IraishoPrintBean bean = (SAA540IraishoPrintBean) meisaiList.get(i);
      
          //1.���݂̃y�[�W
          pl.addPrintStr("1");
          //2.�S�̂̃y�[�W
          pl.addPrintStr("3");
          //3.�^�C�g��
          pl.addPrintStr(getTitle(idPrintId));
          //4.���ψ˗�No
          pl.addPrintStr(bean.getUkagaiNo());
          //5.���ψ˗��N����
          pl.addPrintStr(bean.getMitsumoriIraiYmd());
          //6.�X��
          pl.addPrintStr("");
          //7.�����R�[�h
          pl.addPrintStr(bean.getTorihikisakiCode());
          //8.����於
          pl.addPrintStr(bean.getTorihikisakiMei());
          //9���ؔN����
          pl.addPrintStr(bean.getMitsumoriShimekiriYmd());
          //10.����
          pl.addPrintStr(bean.getSeikyuSu());
          
          //����(�H���E�^���E�ϑ�)
          pl.addPrintStr(bean.getKemmei());
          
          //�i���j�i�ڎd�l�^�^����ԁi���j�^�H���ꏊ�^���{�ꏊ
          pl.addPrintStr(bean.getHimmeiSpec());

          //�^����ԁi���j�E�[�H���i���j�^�i���j�E�x�������ҏW
          if (idPrintId.equals(SAA510Define.ID_MITSU_REQ_PRINT_UNSO)) {
              //�^���̏ꍇ
              //�@�^����ԁi���jbiko
              pl.addPrintStr(getUnsoKukanTo(bean.getShoriTaniId()));
              //�x������
              pl.addPrintStr(bean.getShiharaiJokenMei1());
              //�i���j�\��[�H���i���j
              pl.addPrintStr(bean.getYoteiNokokiFrom());
              //�i���j�\��[�H���i���j
              pl.addPrintStr(bean.getYoteiNokokiTo());

          } else {
              //�i���j�\��[�H���i���j
              pl.addPrintStr(bean.getYoteiNokokiFrom());
              //�i���j�\��[�H���i���j
              pl.addPrintStr(bean.getYoteiNokokiTo());
              //�x������
              pl.addPrintStr(bean.getShiharaiJokenMei1());
          }            
          //�����J�ÔN�����{����   �Ă���
          pl.addPrintStr(bean.getSetumeikaiKaisaiYmd() 
                  + "�@" + bean.getSetumeikaiKaisaiTime());
          //�W���ꏊ
          pl.addPrintStr(getSetsumeiKaiBasho(bean.getMitsuReqId()));

          //���l
          pl.addPrintStr(getBiko(bean.getShoriTaniId()));

          //�����ӏ�
          pl.addPrintStr(bean.getSeikyuKikanMei());
          //�S��
          pl.addPrintStr(bean.getSeikyuTantoMei());
          //�w���ӏ�
          pl.addPrintStr(bean.getKobaiKikanMei());
          //�S��
          pl.addPrintStr(bean.getKobaiTantoMei());

          //����
          pl.addPrintStr(makeChuiBunshoPart(idPrintId));

          //-----------------------------
          //���y�[�W
          //-----------------------------
          pl.addCrLf();
      }

      //-----------------------------
      //�o��
      //-----------------------------
      pl.setPdfFile(data);
      
      
  }
  
  /**
   * ���
   * @param data �f�[�^�e�[�u��
   * @param printId �v�����g�h�c
   * @param meisaiList ���׃��X�g
   * @return Datatable �f�[�^�e�[�u��
   * @throws Exception �G���[
   */
  public Datatable printDataAppend(Datatable data, String printId, ArrayList meisaiList) throws Exception {
      
      
      // ���[ID�̎擾
      PrintLogic pl = (PrintLogic)data.getDatatableValue("PrintLogic");
      
      
      for (int i = 0; i < meisaiList.size(); i++) {

          SAA540IraishoPrintBean bean = (SAA540IraishoPrintBean) meisaiList.get(i);
      
          //1.���݂̃y�[�W
          pl.addPrintStr(bean.getCurrentPage());
          //2.�S�̂̃y�[�W
          pl.addPrintStr(bean.getTotalPage());
          //3.�^�C�g��
          pl.addPrintStr(getTitle(printId));
          //4.���ψ˗�No
          pl.addPrintStr(bean.getUkagaiNo());
          //5.���ψ˗��N����
          pl.addPrintStr(bean.getMitsumoriIraiYmd());
          //���喼�i1�s�ځj
          pl.addPrintStr(bean.getShitenMei());
// 2009.02.25 add J.Matsuo start U20080857
          //���喼�i2�s�ځj
          pl.addPrintStr(bean.getShitenMei2());
// 2009.02.25 add J.Matsuo end U20080857
          //7.�����R�[�h
          pl.addPrintStr(bean.getTorihikisakiCode());
          //8.����於
          pl.addPrintStr(bean.getTorihikisakiMei());
          //9���ؔN����
          pl.addPrintStr(bean.getMitsumoriShimekiriYmd());
          //10.����
//2006.01.26 t.tatsuki mod Start            
//        pl.addPrintStr(bean.getSeikyuSu());
          pl.addPrintStr(bean.getMitsumoriTeishutsuSu());
//2006.01.26 t.tatsuki mod End            
          //�w�l���b�Z�[�W
          pl.addPrintStr(bean.getSashineMsg());
          
// 2008.01.24 Sakamoto Shigefumi U-1966 del Start
          // //���݃��T�C�N�����b�Z�[�W
          // pl.addPrintStr(SAA510Util.nullToBlank(bean.getRecycleMsg()));
// 2008.01.24 Sakamoto Shigefumi U-1966 del End
          
          //����(�H���E�^���E�ϑ�)
          pl.addPrintStr(bean.getKemmei());
          
          //�i���j�i�ڎd�l�^�^����ԁi���j�^�H���ꏊ�^���{�ꏊ
          pl.addPrintStr(bean.getHimmeiSpec());

          //�^����ԁi���j�E�[�H���i���j�^�i���j�E�x�������ҏW
          if (printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_UNSO)) {
              //�^���̏ꍇ
              //�@�^����ԁi���jbiko
              SAA510Util util = new SAA510Util();
              String unsoKukanTo = util.getBikoUkagaiShoriTaniTUnsoKukanTo(data, Long.parseLong(bean.getShoriTaniId()));
              pl.addPrintStr(unsoKukanTo);
              //�x������
              pl.addPrintStr(bean.getShiharaiJokenMei1());
              //�i���j�\��[�H���i���j
              pl.addPrintStr(bean.getYoteiNokokiFrom());
              //�i���j�\��[�H���i���j
              pl.addPrintStr(bean.getYoteiNokokiTo());
          } else {
              //�i���j�\��[�H���i���j
              pl.addPrintStr(bean.getYoteiNokokiFrom());
              //�i���j�\��[�H���i���j
              pl.addPrintStr(bean.getYoteiNokokiTo());
              //�x������
              pl.addPrintStr(bean.getShiharaiJokenMei1());
          }
          
          //�����J�ÔN�����{����
          pl.addPrintStr(bean.getSetumeikaiKaisaiYmd() 
                  + "�@" + bean.getSetumeikaiKaisaiTime());
          //�W���ꏊ
          pl.addPrintStr(getSetsumeiKaiBasho(bean.getMitsuReqId()));

//��rkato added start 2006.03.29 for A1A01��-0142
          //���ώ��^���ؔN����
          pl.addPrintStr(bean.getShitsugiShimekiriYmd());
//��rkato added end 2006.03.29 for A1A01��-0142
          
          //���l
          pl.addPrintStr(getBiko(bean.getShoriTaniId()));

          // 2014.05.09 H.Yamada U20140036 mod Start
          ////�����ӏ�
          //pl.addPrintStr(bean.getSeikyuKikanMei());
          ////�S��
          //pl.addPrintStr(bean.getSeikyuTantoMei());
          // 2014.05.09 H.Yamada U20140036 mod End
          //�w���ӏ�
          pl.addPrintStr(bean.getKobaiKikanMei());
          //�S��
          pl.addPrintStr(bean.getKobaiTantoMei());

          //����
          pl.addPrintStr(makeChuiBunshoPart(printId));

          //-----------------------------
          //���y�[�W
          //-----------------------------
          pl.addCrLf();

      }

      //-----------------------------
      //�o��
      //-----------------------------
      data.putDatatableValue("PrintLogic" , pl);
      return data;
      
  }
  
  /**
   * ���[�^�C�g���擾<br>
   * 
   * ���[�^�C�g�����擾���܂��B<br>
   * <br>
   * @param printId ���[ID
   * @return String ���[�^�C�g��
   */
  public String getTitle(String printId) {
      
      String ret = "";
      
      if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_BUPPIN)) {
          ret = "���i���ψ˗���";
      }
      
      if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_KOJI)) {
          ret = "�H�����ψ˗���";
      }
      
      if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_UNSO)) {
          ret = "�^�����ψ˗���";
      }

      if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_ITAKU)) {
          ret = "�ϑ����ψ˗���";
      }
      return ret;
      
  }

  /**
   * ���ӕ�������\�����܂�<br>
   * 
   * <br>
   * @param printId ���[ID
   * @return ��������������
   * @throws Exception ��O
   */
  public String makeChuiBunshoPart( String printId ) throws Exception {
      
      String ret = "";
      String tmpStr = "";
      double dloopCnt = 0;

      int chuiBunshoMax = 0;
      /* ���ӕ����̕�����(-3�͔ԍ�+�S�p��) */
      int maxLength = 0;

      StringBuffer spece;
      StringBuffer speceWk;
      StringBuffer spece3 = new StringBuffer("   ");
      int addLength = 1;

//��2007.06.22 t.tatsuki mod Start U20070348
//"���ӕ���"���e�ύX�ɂ��A���L�\�����`�������C���B
      // �����L�����̓����e�ɂĕ������ύX��������x�ɕύX���Ȃ���΂Ȃ�Ȃ��B
      // �i���[�o�͂̍s�������ɔ����A�����������ŏ������Ȃ邱�Ƃɂ��A1�s������̍ő啶�������ω�����B�j
      spece = spece3;
      speceWk = spece3;
      if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_BUPPIN)) {
          
          // 2017.11.08 T.Tatsuki U20170253 mod Start
          // 2014.02.26 T.Tatsuki U20140294 mod Start
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          chuiBunshoMax = 16;
          //chuiBunshoMax = 17;
          //chuiBunshoMax = 16;
          //chuiBunshoMax = 15;
    	  // 2014.05.09 H.Yamada U20140036 mod End
          // 2014.02.26 T.Tatsuki U20140294 mod End
          // 2017.11.08 T.Tatsuki U20170253 mod End

          // 2008.07.14 H.Yamada U20080311 mod Start
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          maxLength = 89;
          speceWk = new StringBuffer("    ");
          spece = speceWk;
          addLength = 2;
          //maxLength = 87;
    	  // 2014.05.09 H.Yamada U20140036 mod End
          //maxLength = 84;
          // 2008.07.14 H.Yamada U20080311 mod Start
      } else if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_KOJI)) {
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          chuiBunshoMax = 15;
          //chuiBunshoMax = 14;
    	  // 2014.05.09 H.Yamada U20140036 mod End
          // 2008.07.14 H.Yamada U20080311 mod Start
          maxLength = 81;
          //maxLength = 77;
          //speceWk = new StringBuffer("    ");
          //spece = speceWk;
          addLength = 1;
          //addLength = 2;
          // 2008.07.14 H.Yamada U20080311 mod Start
      } else if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_UNSO)) {
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          chuiBunshoMax = 13;
          //chuiBunshoMax = 12;
    	  // 2014.05.09 H.Yamada U20140036 mod End
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          maxLength = 73;
          //maxLength = 68;
    	  // 2014.05.09 H.Yamada U20140036 mod End
      } else if ( printId.equals(SAA510Define.ID_MITSU_REQ_PRINT_ITAKU)) {
//��2009.10.27 k.miyamoto mod Start U20090226
//          chuiBunshoMax = 12;
    	  // 2014.05.09 H.Yamada U20140036 mod Start
          chuiBunshoMax = 14;
          //chuiBunshoMax = 13;
    	  // 2014.05.09 H.Yamada U20140036 mod End
//��2009.10.27 k.miyamoto mod End U20090226
          // 2008.07.14 H.Yamada U20080311 mod Start
//��2009.10.27 k.miyamoto mod Start U20090226
//          maxLength = 72;
//          speceWk = new StringBuffer("    ");
          maxLength = 75;
          speceWk = new StringBuffer("     ");
//��2009.10.27 k.miyamoto mod End U20090226
          spece = speceWk;
//��2009.10.27 k.miyamoto mod Start U20090226
//          addLength = 2;
          addLength = 3;
//��2009.10.27 k.miyamoto mod End U20090226
          //maxLength = 68;
          // 2008.07.14 H.Yamada U20080311 mod End
      }
//��2007.06.22 t.tatsuki mod End
      
      for (int i = 0; i < chuiBunshoMax; i++) {
          tmpStr = getChuiBunshoIdx(String.valueOf(i));

          int offSet = maxLength + 1;
          //���ӕ����������s�Ɍׂ�ꍇ�́C���ӕ����ԍ��{�󔒕��̌��Ԃ��쐬����
          if (tmpStr.length() > offSet) {
              StringBuffer strBuff = new StringBuffer(tmpStr);
              //�s���֑������Ή�
              if (strBuff.charAt(offSet) == '�A'
                  || strBuff.charAt(offSet) == '�B'
                      || strBuff.charAt(offSet) == '�j') {
                  offSet++;
                  spece = spece3;
              }
              strBuff = strBuff.insert(offSet, spece);
              tmpStr = strBuff.toString();
              
              spece = speceWk;
                            
              if (tmpStr.substring(offSet).length() > maxLength + 1) {
                  strBuff = new StringBuffer(tmpStr.substring(0,offSet));
                  StringBuffer strBuff2 = new StringBuffer(tmpStr.substring(offSet));                  
                  //�s���֑������Ή�
                  if (strBuff2.charAt(maxLength + 1) == '�A'
                      || strBuff2.charAt(maxLength + 1) == '�B'
                          || strBuff2.charAt(maxLength + 1) == '�j') {
                      offSet = maxLength + addLength + 1;
                  } else {
                      offSet = maxLength + addLength;
                  }
                  strBuff2 = strBuff2.insert(offSet, spece);
                  tmpStr = strBuff.toString() + strBuff2.toString();
              }
          }
          ret = ret + ((i < 9)?" " + tmpStr.trim() : tmpStr.trim());

          if ( i != chuiBunshoMax ) {
              ret = ret + CRLF_CODE;
          }
      }
      
      return ret;
  }

  /**
   * ���ӕ����擾<br>
   * 
   * @param chuiBunshoNoSort �\�����钍�ӕ����̃L�[���\�[�g���ɕ��ׂ��z��
   * @return String
   */
  public String getChuiBunshoTokutei(String[] chuiBunshoNoSort) {

      String ret = "";
      
      int j = 0;
      
      for (int i = 0; i < chuiBunshoNoSort.length; i++) {
          j++;
          ret = ret + ((j < 10)?" " + String.valueOf(j) : String.valueOf(j))
                  + " "  + getChuiBunshoIdx(chuiBunshoNoSort[i]);
          
      
          if ( i != chuiBunshoNoSort.length ) {
              ret = ret + CRLF_CODE;
          }
      }
      
      return ret;
  }
  
  
  
  
  /**
   * ���l�擾
   * @param shoriTaniId �����P��ID
   * @return String
   */
  public String getBiko(String shoriTaniId) {
      if ( hBiko == null || hBiko.size() <= 0) {
          return "";
      }
      return (String)hBiko.get(shoriTaniId);
  }
  /**
   * ���l�ݒ�
   * @param biko ���l
   */
  public void setBiko(HashMap biko) {
      hBiko = biko;
  }
  /**
   * ������W���ꏊ�擾
   * @param mitsuReqId ���ψ˗�ID
   * @return String
   */
  public String getSetsumeiKaiBasho(String mitsuReqId) {
      if ( hSetsumeiKaiBasho == null || hSetsumeiKaiBasho.size() <= 0) {
          return "";
      }
      return (String)hSetsumeiKaiBasho.get(mitsuReqId);
  }
  /**
   * ������W���ꏊ�ݒ�
   * @param setsumeiKaiBasho ������W���ꏊ
   */
  public void setSetsumeiKaiBasho(HashMap setsumeiKaiBasho) {
      hSetsumeiKaiBasho = setsumeiKaiBasho;
  }
  /**
   * �^����ԁi���j�擾
   * @param shoriTaniId �����P��ID
   * @return String
   */
  public String getUnsoKukanTo(String shoriTaniId) {
      if ( hUnsoKukanTo == null || hUnsoKukanTo.size() <= 0) {
          return "";
      }
      return (String)hUnsoKukanTo.get(shoriTaniId);
  }
  /**
   * �^����ԁi���j�ݒ�
   * @param unsoKukanTo �^����ԁi���j
   */
  public void setUnsoKukanTo(HashMap unsoKukanTo) {
      hUnsoKukanTo = unsoKukanTo;
  }
  /**
   * ���ӕ����擾
   * @return chuiBunsho ���ӕ���
   */
  public HashMap getChuiBunsho() {
      return chuiBunsho;
  }
  /** TreeMap�̃C���f�b�N�X
   * @param idx TreeMap�̃C���f�b�N�X
   * @return chuiBunsho
   */
  public String getChuiBunshoIdx(String idx) {
      return (String)this.chuiBunsho.get(idx);
  }
  /**
   * ���ӕ����ݒ�
   * @param achuiBunsho ���ӕ���
   */
  public void setChuiBunsho(HashMap achuiBunsho) {
      this.chuiBunsho = achuiBunsho;
  }
  /**
   * ���i���ψ˗����i���ׁj�擾
   * @return iraishoMeisai ���i���ψ˗����i���ׁj
   */
  public HashMap getIraishoMeisai() {
      return iraishoMeisai;
  }
  /**
   * ���i���ψ˗����i���ׁj�擾�i�L�[���ڎw��j<br>
   * �˗����̖��ׂ��C�L�[���w�肵�Ď擾���܂��B
   * @param mitsuReqId ���ψ˗�ID
   * @param mitsuReqEdano ���ψ˗��}�ԍ�
   * @return iraishoMeisai
   */
  public ArrayList getIraishoMeisai(String mitsuReqId, String mitsuReqEdano) {
      
      String hKey = SAA510Util.mitsuReqIdJoinEdaNo(mitsuReqId, mitsuReqEdano);
      
      ArrayList al = (ArrayList)iraishoMeisai.get(hKey);
      
      
      return al;
  }
  /**
   * ���i���ψ˗����i���ׁj�ݒ�
   * @param airaishoMeisai ���i���ψ˗����i���ׁj
   */
  public void setIraishoMeisai(HashMap airaishoMeisai) {
      this.iraishoMeisai = airaishoMeisai;
  }
  /**
   * �ϑ����ψ˗����擾
   * @return itakuIraisho �ϑ����ψ˗���
   */
  public ArrayList getItakuIraisho() {
      return itakuIraisho;
  }
  /**
   * �ϑ����ψ˗����ݒ�
   * @param itakuIraisho �ϑ����ψ˗���
   */
  public void setItakuIraisho(ArrayList itakuIraisho) {
      this.itakuIraisho = itakuIraisho;
  }
  /**
   * �H�����ψ˗����擾
   * @return kojiIraisho �H�����ψ˗���
   */
  public ArrayList getKojiIraisho() {
      return kojiIraisho;
  }
  /**
   * �H�����ψ˗����ݒ�
   * @param kojiIraisho �H�����ψ˗���
   */
  public void setKojiIraisho(ArrayList kojiIraisho) {
      this.kojiIraisho = kojiIraisho;
  }
  /**
   * �^�����ψ˗����擾
   * @return unsoIraisho �^�����ψ˗���
   */
  public ArrayList getUnsoIraisho() {
      return unsoIraisho;
  }
  /**
   * �^�����ψ˗����ݒ�
   * @param unsoIraisho �^�����ψ˗���
   */
  public void setUnsoIraisho(ArrayList unsoIraisho) {
      this.unsoIraisho = unsoIraisho;
  }
  /**
   * �Ɩ��敪�擾
   * @return gyomuKubun �Ɩ��敪
   */
  public String getGyomuKubun() {
      return gyomuKubun;
  }
  /**
   * �^�����ψ˗����ݒ�
   * @param aGyomuKubun �^�����ψ˗���
   */
  public void setGyomuKubun(String aGyomuKubun) {
      this.gyomuKubun = aGyomuKubun;
  }
}

