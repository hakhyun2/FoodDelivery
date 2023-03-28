<template>

    <v-data-table
        :headers="headers"
        :items="deliverylist"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DeliverylistView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            deliverylist : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/deliverylists'))

            temp.data._embedded.deliverylists.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.deliverylist = temp.data._embedded.deliverylists;
        },
        methods: {
        }
    }
</script>

