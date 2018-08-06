package com.example.mansigoel.charts

import android.annotation.TargetApi
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.mansigoel.charts.R.id.*
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        setupBarChartData()

        setupLineChartData()

      //  setUpPieChartData()
    }
/*
    private fun setUpPieChartData() {
        val yVals = ArrayList<PieEntry>()
        yVals.add(PieEntry(30f))
        yVals.add(PieEntry(2f))
        yVals.add(PieEntry(4f))
        yVals.add(PieEntry(22f))
        yVals.add(PieEntry(12.5f))

        val dataSet = PieDataSet(yVals, "")
        dataSet.valueTextSize=0f
        val colors = java.util.ArrayList<Int>()
        colors.add(Color.GRAY)
        colors.add(Color.BLUE)
        colors.add(Color.RED)
        colors.add(Color.GREEN)
        colors.add(Color.MAGENTA)

        dataSet.setColors(colors)
        val data = PieData(dataSet)
        pieChart.data = data
        pieChart.centerTextRadiusPercent = 0f
        pieChart.isDrawHoleEnabled = false
        pieChart.legend.isEnabled = false
        pieChart.description.isEnabled = false
    }
*/
    private fun setupLineChartData() {
        val yVals = ArrayList<Entry>()

        val Sval1=16f
        val Sval2=56f
        val Sval3=78f
        val Sval4=40f
        val Sval5=88f
        val Sval6=25f
        val Sval7=68f
        val Sval8=117f
        val Sval9=65f
        val Sval10=24f
        val Sval11=53f
        val Sval12=98f

        yVals.add(Entry(0f, Sval1, "0"))
        yVals.add(Entry(1f, Sval2, "1"))
        yVals.add(Entry(2f, Sval3, "2"))
        yVals.add(Entry(3f, Sval4, "3"))
        yVals.add(Entry(4f, Sval5, "4"))
        yVals.add(Entry(5f, Sval6, "5"))
        yVals.add(Entry(6f, Sval7, "6"))
        yVals.add(Entry(7f, Sval8, "7"))
        yVals.add(Entry(8f, Sval9, "8"))
        yVals.add(Entry(9f, Sval10, "9"))
        yVals.add(Entry(10f, Sval11, "10"))
        yVals.add(Entry(11f, Sval12, "11"))

        val set1: LineDataSet
        set1 = LineDataSet(yVals, "DataSet 1")

        // set1.fillAlpha = 110
        // set1.setFillColor(Color.RED);

        // set the line to be drawn like this "- - - - - -"
        // set1.enableDashedLine(5f, 5f, 0f);
        // set1.enableDashedHighlightLine(10f, 5f, 0f);
        set1.color = Color.BLUE
        set1.setCircleColor(Color.BLUE)
        set1.lineWidth = 1f
        set1.circleRadius = 3f
        set1.setDrawCircleHole(false)
        set1.valueTextSize = 0f
        set1.setDrawFilled(false)

        val dataSets = ArrayList<ILineDataSet>()
        dataSets.add(set1)
        val data = LineData(dataSets)

        // set data
        lineChart.setData(data)
        lineChart.description.isEnabled = false
        lineChart.legend.isEnabled = false
        lineChart.setPinchZoom(true)
        lineChart.xAxis.enableGridDashedLine(5f, 5f, 0f)
        lineChart.axisRight.enableGridDashedLine(5f, 5f, 0f)
        lineChart.axisLeft.enableGridDashedLine(5f, 5f, 0f)
        //lineChart.setDrawGridBackground()
        lineChart.xAxis.labelCount = 11
        lineChart.xAxis.position = XAxis.XAxisPosition.BOTTOM


    //平均の計算
        val Ssum=(Sval1+Sval2+Sval3+Sval4+Sval5+Sval6+Sval7+Sval8+Sval9+Sval10+Sval11+Sval12)/12

        val messageView3: TextView = findViewById(R.id.Sval)
        messageView3.text = "食事時間："+Ssum+"分"



    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupBarChartData() {
        // create BarEntry for Bar Group
        val bargroup = ArrayList<BarEntry>()

        val Tval1=30f
        val Tval2=2f
        val Tval3=4f
        val Tval4=6f
        val Tval5=8f
        val Tval6=10f
        val Tval7=22f
        val Tval8=12.5f
        val Tval9=22f
        val Tval10=32f
        val Tval11=54f
        val Tval12=28f

        bargroup.add(BarEntry(0f, Tval1, "0"))
        bargroup.add(BarEntry(1f, Tval2, "1"))
        bargroup.add(BarEntry(2f, Tval3, "2"))
        bargroup.add(BarEntry(3f, Tval4, "3"))
        bargroup.add(BarEntry(4f, Tval5, "4"))
        bargroup.add(BarEntry(5f, Tval6, "5"))
        bargroup.add(BarEntry(6f, Tval7, "6"))
        bargroup.add(BarEntry(7f, Tval8, "7"))
        bargroup.add(BarEntry(8f, Tval9, "8"))
        bargroup.add(BarEntry(9f, Tval10, "9"))
        bargroup.add(BarEntry(10f, Tval11, "10"))
        bargroup.add(BarEntry(11f, Tval12, "11"))

        // creating dataset for Bar Group
        val barDataSet = BarDataSet(bargroup, "")

        barDataSet.color = ContextCompat.getColor(this, R.color.amber)

        val data = BarData(barDataSet)
        barChart.setData(data)
        barChart.xAxis.position = XAxis.XAxisPosition.BOTTOM
        barChart.xAxis.labelCount = 11
        barChart.xAxis.enableGridDashedLine(5f, 5f, 0f)
        barChart.axisRight.enableGridDashedLine(5f, 5f, 0f)
        barChart.axisLeft.enableGridDashedLine(5f, 5f, 0f)
        barChart.description.isEnabled = false
        barChart.animateY(1000)
        barChart.legend.isEnabled = false
        barChart.setPinchZoom(true)
        barChart.data.setDrawValues(false)


        barChart.setOnClickListener {
            val intent = Intent(this, graphclick::class.java)
            startActivity(intent)
        }

        //平均の計算
        val Tsum=(Tval1+Tval2+Tval3+Tval4+Tval5+Tval6+Tval7+Tval8+Tval9+Tval10+Tval11+Tval12)/12

        val messageView2: TextView = findViewById(R.id.Tval)
        messageView2.text = "咀嚼回数："+Tsum+"回"


        //評価点数の計算
        val score= 90
        val messageView4: TextView = findViewById(R.id.score)
        messageView4.text = "評価点数："+score+"点"


        //アドバイスの内容の更新

        var id1=0

        //評価点数による顔や○×の変更ID
        if (0<=score){
            id1=3
        }
        if(25<=score) {
            id1=2
        }
        if(50<=score) {
            id1=1
        }
        if(75<=score) {
            id1=0
        }

        var id2=0
        var id3=0

        var food_val=10   //食事内容によるパラメータ


        //食事内容によるアドバイス変更ID
        if (food_val<=10){
            id2=1
        }else
        {
            id2=0
        }

        //咀嚼回数によるアドバイス変更ID
        if (Tsum<1000){
            id3=1
        }else
        {
            id3=0
        }

        var text1=""
        var text2=""

        //○×の分岐
        val messageView: TextView = findViewById(R.id.advice2)
        when(id1) {
            0 -> text1 = "◎"
            1 -> text1 = "○"
            2 -> text1 = "△"
            3 -> text1 = "×"
        }
        //顔の分岐
        when(id1) {
            0 -> onesan.setImageResource(R.drawable.nijyumaru)
            1 -> onesan.setImageResource(R.drawable.maru)
            2 -> onesan.setImageResource(R.drawable.sankaku)
            3 -> onesan.setImageResource(R.drawable.batu)
        }
       //○×の書き込み
        messageView.text = text1 //+text2

        //アドバイス内容の分岐
        val messageView5: TextView = findViewById(R.id.advice)
        when(id3) {
             0 -> text1 = "咀嚼回数が十分です。この調子で頑張りましょう。"
             1 -> text1 = "咀嚼回数が少ないです。健康に悪影響が出るほか肥満の原因にもなります。"
         }
        when(id2) {
            0 -> text2 = "バランスのいい食事がとれています。健康的な食事といえるでしょう。"

            1 -> text2 = "食事内容に偏りがあります。栄養バランスを考えましょう。"}


       //アドバイスの合成
        messageView5.text ="[アドバイス]"+ text1 +text2


    }
}
