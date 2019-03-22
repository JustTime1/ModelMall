package com.example.administrator.modelmall.ui.activities;


import android.view.View;
import android.widget.TextView;

import com.example.administrator.modelmall.R;
import com.example.administrator.modelmall.ui.customview.StatusBarUtils;
import com.example.administrator.modelmall.ui.customview.ToastUtils;
import com.joanzapata.iconify.widget.IconTextView;

import butterknife.BindView;

/**
 * 商品的具体内容
 * <p>
 * 用户在主页或者其他页面看商品则跳转此页面
 */

public class GoodsInfoActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.tv_share)
    IconTextView tvShare;
    @BindView(R.id.tv_back)
    IconTextView tvBack;
    @BindView(R.id.custom_service)
    IconTextView customService;
    @BindView(R.id.look_shop)
    IconTextView lookShop;
    @BindView(R.id.add_cart)
    TextView addCart;
    @BindView(R.id.buy_rightnow)
    TextView buyRightNow;


    @Override
    public Object offerLayout() {
        return R.layout.activity_goods_info;
    }

    @Override
    public void onBindView() {
        hideActionBar();
        StatusBarUtils.setWindowStatusBarColor(this, R.color.orange);
        tvBack.setOnClickListener(this);
        tvShare.setOnClickListener(this);
        customService.setOnClickListener(this);
        lookShop.setOnClickListener(this);
        addCart.setOnClickListener(this);
        buyRightNow.setOnClickListener(this);

    }


    @Override
    public void destory() {
    }

    /**
     * 点击事件的同一处理
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_share:
                ToastUtils.showToast(this, "待续！", ToastUtils.LENGTH_LONG);
                break;
            case R.id.tv_back:
                finish();
                break;
            case R.id.custom_service:
                ToastUtils.showToast(this, "程序员小哥正在请客服过来！", ToastUtils.LENGTH_LONG);
                break;
            case R.id.look_shop:
                ToastUtils.showToast(this, "程序员小哥正在努力赶来！", ToastUtils.LENGTH_LONG);
                break;
            case R.id.add_cart:
                ToastUtils.showToast(this, "商品已经添加到购物车！", ToastUtils.LENGTH_LONG);
                break;
            case R.id.buy_rightnow:
                ToastUtils.showToast(this, "model支付平台还未开张！", ToastUtils.LENGTH_LONG);
                break;
        }
    }
}
