
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerOrderInfoManager from "./components/listers/CustomerOrderInfoCards"
import CustomerOrderInfoDetail from "./components/listers/CustomerOrderInfoDetail"


import OwnerOrderInfoManager from "./components/listers/OwnerOrderInfoCards"
import OwnerOrderInfoDetail from "./components/listers/OwnerOrderInfoDetail"



import DeliveryInfoManager from "./components/listers/DeliveryInfoCards"
import DeliveryInfoDetail from "./components/listers/DeliveryInfoDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customerOrderInfos',
                name: 'CustomerOrderInfoManager',
                component: CustomerOrderInfoManager
            },
            {
                path: '/customerOrderInfos/:id',
                name: 'CustomerOrderInfoDetail',
                component: CustomerOrderInfoDetail
            },


            {
                path: '/ownerOrderInfos',
                name: 'OwnerOrderInfoManager',
                component: OwnerOrderInfoManager
            },
            {
                path: '/ownerOrderInfos/:id',
                name: 'OwnerOrderInfoDetail',
                component: OwnerOrderInfoDetail
            },



            {
                path: '/deliveryInfos',
                name: 'DeliveryInfoManager',
                component: DeliveryInfoManager
            },
            {
                path: '/deliveryInfos/:id',
                name: 'DeliveryInfoDetail',
                component: DeliveryInfoDetail
            },




    ]
})
